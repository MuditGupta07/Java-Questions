import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        System.out.println("Welcome To My Restaurant");
        System.out.println("Our Menu");
        int Dp= 50;
        int Ip= 25;
        int Cdp= 50;
        System.out.println("1.Dosa: Rs"+Dp);
        System.out.println("2.Idli: Rs"+Ip);
        System.out.println("3.ColdDrink: Rs"+Cdp);
        Scanner scan= new Scanner(System.in);
        System.out.print("Dosa Quantity: ");
        int Dosa= Integer.parseInt(scan.nextLine());
        if(Dosa<0){
            System.out.println("Invalid Output! Try again");
            scan.close();
            return;
        }
        System.out.print("Idli Quantity: ");
        int Idli= Integer.parseInt(scan.nextLine());

        System.out.print("ColdDrink Quantity: ");
        int ColdDrink= Integer.parseInt(scan.nextLine());

        System.out.println("=======Your Bill=======");
        System.out.println("Dosa: "+ Dosa + "x Rs"+Dp+" = "+ Dosa*Dp );
        System.out.println("Idli: "+ Idli + "x Rs"+Ip+" = "+ Idli*Ip);
        System.out.println("ColdDrink: "+ ColdDrink + "x Rs"+Cdp+" = "+ ColdDrink*Cdp );

        System.out.println("-----------------------------");
        System.out.println("Total Bill: "+ (Dosa*Dp + Idli*Ip + ColdDrink*Cdp));
        System.out.println("Thank You");
        scan.close();
    }
}