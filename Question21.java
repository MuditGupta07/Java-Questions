//Factorial using java
public class Question21 {

    static void fact(int n,int ans){
        if(n==1){
            System.out.println("Factorial: "+ans);
            return;
        }
        ans*=n;
        fact(n-1,ans);
    }

    static int fact2(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact2(n-1);
    }
    public static void main(String[] args) {
        fact(6,1);
        System.out.println(fact2(5));
    }
}
