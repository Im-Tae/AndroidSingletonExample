package com.example.singleton;

public class JavaDataSingleton {
    private static JavaDataSingleton instance = null;

    private JavaDataSingleton() {

    }

    public static JavaDataSingleton getInstance() {
        if (instance == null) {
            instance = new JavaDataSingleton();
        }

        return instance;
    }

    String message = null;
}
