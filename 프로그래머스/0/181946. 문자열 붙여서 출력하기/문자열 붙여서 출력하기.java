import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a+b;
        
        String[] array = c.split(" ");
        
        System.out.println(c);
    }
}