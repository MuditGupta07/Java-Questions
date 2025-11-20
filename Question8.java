//Fibonacci Series up to N Terms
public class Question8 {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=8;

        //First Method
        // System.out.println(first);
        // System.out.println(second);
        // for(int i=1;i<=n-2;i++){
        //     int sum= first+second;
        //     System.out.println(sum);
        //     first=second;
        //     second=sum;
        // }

        //Second Method
        for(int i=0;i<n;i++){
            System.out.println(first);
            int next= first+second;
            first=second;
            second=next;
        }
    }
}
