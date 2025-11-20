import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Units: ");
        int units= Integer.parseInt(scan.nextLine());
        double price=0;
        if(units>=200){
            price= ((100*1.5)+(100*2.5)+((units-200)*3.5));
        }

        else if(units>=100 && units<200){
            price= ((100*1.5)+((units-100)*2.5));
        }

        else{
            price= units*1.5;
        }

        System.out.println("Electricity Bill: "+price);
        scan.close();
    }
}
