package org.example;

class Class394Check {
    int a;
    int b;
}

public class Ex394Check {
    static void func1(Class394Check m){
        m.a *= 10;
    }
    static void func2(Class394Check m){
        m.a += m.b;
    }

    public static void main(String[] args) {
        Class394Check m = new Class394Check();
        m.a = 100;
        func1(m); // m.a = 1000
        m.b = m.a; // m.b = 1000
        func2(m); // m.a = 2000
        System.out.printf("%d", m.a);
    }
}
