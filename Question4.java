//Prime Number
public class Question4 {
    public static void main(String[] args) {
        int num=97;
        int flag=1;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
