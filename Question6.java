//Swap First and Last Digit Input: 1234 → Output: 4231
public class Question6 {
    public static void main(String[] args) {
        int num=265314;
        int d=0;
        int n=num;
        while(n>0){
            n/=10;
            d++;
        }
        n=num;
        int Pow = (int)Math.pow(10, (d-1));
        int last=n%10;
        int mid=n/10;
        mid=(mid%(Pow/10));
        int first=n/Pow;

        int number= (((last*(Pow/10))+mid)*10)+first;
        System.out.println(first);
        System.out.println(mid);
        System.out.println(last);   
        System.out.println(number);
    }
}
