package org.example;


class ClassA {
    int a = 10;
    int funcAdd(int x, int y){
        return x + y + a; // 3 + 6 + 10 = 19
    }

}
public class Ex394 {
    public static void main(String[] args) {
        int x = 3, y = 6, r;
        ClassA cal = new ClassA();
        r = cal.funcAdd(x, y); // 19
        System.out.print(r); // 19
    }
}
