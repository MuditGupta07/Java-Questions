//Armstrong number using recursion
public class Question24 {
    static int count=0;
    static int sum=0;

    static int power(int n, int pow){
        if(pow==0){
            return 1;
        }
        return n*power(n,pow-1);
    }

    static void isArmstrong(int n){
        if(n==0){
            return;
        }
        
        if(n>0){
            count++;
        }
        isArmstrong(n/10);

        sum+= power((n%10),count);
    }
    public static void main(String[] args) {
        int num=153;
        isArmstrong(num);
        System.out.println(num==sum ? "Armstrong number" : "Not an Armstrong Number");
    }
}
