package org.example;

public class Ex389Check {
    public static void main(String[] args) {

        int j, i;

        for(j = 0, i = 0; i <= 5; i++){
            j += i;
            // j = 0 i = 0
            // j = 1 i = 1
            // j = 3 i = 2
            // j = 6 i = 3
            // j = 10 i = 4
            // j = 15 i = 5
            System.out.print(i);

            if( i == 5) {
                System.out.print("=");
                System.out.print(j);
            }else {
                System.out.print("+");
            }
            // 0+1+2+3+4+5=15
        }
    }
}
