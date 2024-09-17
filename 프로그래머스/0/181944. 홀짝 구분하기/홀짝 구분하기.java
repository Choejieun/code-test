import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "모름";
        
        if(n % 2 == 1){
            answer = n+" is odd";
        }else{
            answer = n+" is even";
        }
        
        System.out.println(answer);
    }
}