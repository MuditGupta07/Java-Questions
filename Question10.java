//Print All Prime Numbers from 1 to N
public class Question10 {
    public static boolean IsPrime(int num){
            int flag=1;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                return true;
            }
            else{
                return false;
            }
        }
    public static void main(String[] args) {
        int n=50;
        System.out.println("Prime Numbers: ");
        for(int i=2;i<=n;i++){
            if(IsPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
}
