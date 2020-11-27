package org.jetbrains.someapp;

import org.jetbrains.eclipselib.LibImpl;

public class Main {
    public static void main(String[] args) {
        new LibImpl("World").sayHello();
    }
}
