//Count How Many Digits are Divisors of the Number Input: 122 → Output: 3 (1,2,2 divide 122)
public class Question12 {
    public static void main(String[] args) {
        int num=12126;
        int count=0;
        int n=num;
        while(n>0){
            int rem=n%10;
        
            if(num%rem==0){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
