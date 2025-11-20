//Calculate Digital Root of a Number
//Keep summing digits until a single digit remains
public class Question15 {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }   
        while (sum>=10){
            n=sum;
            sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
        }
        System.out.println(sum);
    }
}

