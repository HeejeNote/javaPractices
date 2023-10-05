package org.example;


class Class395CP {
    int a;
    public Class395CP(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("a = " + a);
    }
}

class Class395C extends  Class395CP {

    public Class395C(int a) {
        super(a);
        super.display();
    }
}
public class Ex395Check {
    public static void main(String[] args) {
        Class395C obj = new Class395C(10); // a = 10
    }
}
