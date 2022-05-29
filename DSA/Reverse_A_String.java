package DSA;

import java.util.*;


public class Reverse_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();

        String ans = new StringBuilder(str).reverse().toString();
        System.out.println(ans);
 }
}
