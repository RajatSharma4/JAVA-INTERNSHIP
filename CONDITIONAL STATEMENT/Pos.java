import java.util.Scanner;

public class Pos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        sc.close();

        
    }
}