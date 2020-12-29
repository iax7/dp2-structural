package com.iax.composite;

import com.iax.adapter.CaramelFilter;
import com.iax.adapter.Image;
import com.iax.adapter.ImageView;
import com.iax.adapter.VividFilter;
import com.iax.adapter.externalFilters.Caramel;
import com.iax.bridge.RemoteControl;
import com.iax.bridge.SamsungTV;
import com.iax.bridge.SonyTV;
import com.iax.decorator.CloudStream;
import com.iax.decorator.CompressedCloudStream;
import com.iax.decorator.EncryptedCloudStream;
import com.iax.facade.NotificationService;
import com.iax.flyweight.PointIconFactory;
import com.iax.flyweight.PointService;
import com.iax.proxy.EbookProxy;
import com.iax.proxy.Library;

public class main {
    public static void composite() {
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }

    public static void adapter() {
        // Allows converting the interface of a class into another interface that clients expect.
        var iv = new ImageView(new Image());
        iv.apply(new VividFilter());
        iv.apply(new CaramelFilter(new Caramel()));
    }

    public static void decorator() {
        // Adds additional behavior to an object dynamically.
        var creditCard = "1234-1234-1234-1234";
        var cs = new CloudStream();
        var compressor = new CompressedCloudStream(cs);
        var encryptor = new EncryptedCloudStream(compressor);
        encryptor.write(creditCard);
    }

    public static void facade() {
        // Provides a simplified, higher-level interface to a subsystem. Clients can talk to the
        // facade rather than individual classes in the subsystem.
        // When you have complex setup, you can implement all in a easy reusable class function
        var service = new NotificationService();
        service.send("Hello World", "target_ip");
    }

    public static void flyweight() {
        // Provides a simplified, higher-level interface to a subsystem.
        // Clients can talk to the facade rather than individual classes in the subsystem.

        // When you have big objects in memory you want to keep the mem consuming part
        // independently and reusable
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }

    public static void bride() {
        // Allows representing hierarchies that grow in two different dimensions independently.
        var sonyControl = new RemoteControl(new SonyTV());
        sonyControl.turnOn();

        var samControl = new RemoteControl(new SamsungTV());
        samControl.turnOn();
    }

    public static void proxy() {
        // Allows providing a substitute for another object. The proxy object delegates all the work
        // to the target object and contains some additional behavior.

        // Creating an Ebook is costly (loads in memory) we need an agent that loads on demand
        // A.K.A. -> Lazy Loading / Initialization
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new EbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }

    public static void main(String[] args) {
        proxy();
    }
}
