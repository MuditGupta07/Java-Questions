//Sum of digits using recursion
public class Question18 {
    static void Sum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int ld=n%10;
        sum+=ld;
        Sum(n/10,sum);
    }

    static int Sum2(int n){
        if(n==0){
            return 0;
        }
        int ld=n%10;
        return ld+Sum2(n/10);
    }
    public static void main(String[] args) {
        Sum(5854,0);
        System.out.println(Sum2(5485));
    }
}
