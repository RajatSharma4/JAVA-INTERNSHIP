import java.util.Scanner;
public class Psquare {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter side :");
        int s = sc.nextInt();
        int per = 4*s;
        System.out.println("perimeter is :" + per);
        
    }
}
