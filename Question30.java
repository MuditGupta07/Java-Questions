//Product of digits
public class Question30{
    static int product(int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        int num= (n%10)*(m%10);

        return num+product((n/10),(m/10));
    }
    public static void main(String[] args){
        System.out.println(product(36,4532));
    }
}