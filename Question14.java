//Odd Even without % operator
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num= Integer.parseInt(scan.nextLine());
        if((num&0)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        scan.close();
    }
}
