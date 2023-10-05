package org.example;


class Class395P {
    public Class395P() {
        System.out.print('A');
        this.prn();
    }

    void prn() {
        System.out.print('B');
    }
}

class Class395 extends Class395P {
    Class395(){
        super();
        System.out.print('D');
    }

    void prn(){
        System.out.print('E');
    }

    void prn(int x) {
        System.out.print(x);
    }
}
public class Ex395 {
    public static void main(String[] args) {
        int x = 7;
        Class395 cal = new Class395();
        cal.prn(x); // AED7
    }
}
