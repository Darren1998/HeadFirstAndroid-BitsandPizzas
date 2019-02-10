package com.darrenblog.bitsandpizzas;

public class Pasta {

    private String name;
    private int imageResourceId;

    public Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final Pasta[] pastas = {
      new Pasta("Spaghetti Bolognese", R.drawable.diavolo),
      new Pasta("Lasagne", R.drawable.funghi)
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
