//Find the Largest Digit in a Number
public class Question5 {
    public static void main(String[] args) {
        int num=3700754;
        int max=0;
        while(num>0){
            int rem= num%10;
            if(rem>max){
                max=rem;
            }
            num/=10;
        }
        System.out.println("Largest Digit: "+max);
    }
}
