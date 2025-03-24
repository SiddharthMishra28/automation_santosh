package com.java.oop.abstraction;

// 100% Abstraction
public interface Http {

    // USED TO GET or READ DATA
    void getMethod();

    // USED to INSERT or WRITE DATA
    void postMethod();

    void patchMethod();

    void putMethod();

    void deleteMethod();
}
