//2^n using bitwise
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= Integer.parseInt(scan.nextLine());
        if((n&(n-1))==0){
            System.out.println("It is a power of two");
        }
        else{
            System.out.println("It is not a power of two");
        }
        scan.close();
    }
}
