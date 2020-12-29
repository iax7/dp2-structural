package com.iax.flyweight;

// Flyweight object, instead of storing this data for each Point object
public class PointIcon {
    private final PointType type; // 4 bytes
    private final byte[] icon;    // 20 KB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
