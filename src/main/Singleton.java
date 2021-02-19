package main;

public final class Singleton {

    public static final Singleton object = new Singleton();

    private Singleton() {
    }

    public static Singleton aObject() {
        return object;
    }
}
