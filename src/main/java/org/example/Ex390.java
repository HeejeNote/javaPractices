package org.example;

public class Ex390 {
    public static void main(String[] args) {
        int a = 0, sum = 0;
        while ( a < 10 ) {
            a++;
            if( a % 2 == 1){
                continue;
            }
            sum += a;
        }
        System.out.println(sum); // 2 4 6 8 10 = 30
    }
}
