package com.iax.adapter;

import com.iax.adapter.externalFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
