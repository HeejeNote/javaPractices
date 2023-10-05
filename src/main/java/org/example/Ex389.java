package org.example;

public class Ex389 {
    public static void main(String[] args) {
        String str = "agile";
        int x[] = { 1, 2, 3, 4, 5};
        char y[] = new char[5];
        int i = 0;
        while ( i < str.length()) { //5 5踰덈컲蹂?
            y[i] = str.charAt(i); // a g i l e
            i++;
            // i = 0 ::: a
            // i = 1 ::: g
            // i = 2 ::: i
            // i = 3 ::: l
            // i = 4 ::: e
        }
        for(int p : x){
            i--;
            // i = 4 ::: p = 1
            // i = 3 ::: p = 2
            // i = 2 ::: p = 3
            // i = 1 ::: p = 4
            // i = 0 ::: p = 5
            System.out.print(y[i]); // e l i g a
            System.out.print(p + " "); // 1 2 3 4 5
            // e
        }
    }
}
