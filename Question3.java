//Reverse Of the number and palindrome of the number
public class Question3 {
    public static void main(String[] args) {
        int num=12231;
        int n=num;
        int rev=0;
        int d=0;
        while(n>0){
            n/=10;
            d++;
        }
        n=num;
        int Pow = (int)Math.pow(10, (d-1));
        while(n>0){
            int rem=n%10;
            rev= rev + (rem*Pow);
            Pow/=10;
            n/=10;
        }
        System.out.println("Reverse Number: "+rev);
        if(rev==num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
