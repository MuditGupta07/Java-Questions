//Sum of all digits

public class Question2 {
    public static void main(String[] args) {
        int n=1234;
        int Sum=0;
        while(n>0){
            int rem=n%10;
            Sum+=rem;
            n/=10;
        }
        System.out.println(Sum);
    }
}
