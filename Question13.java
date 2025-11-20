//Check if Digits are in Ascending Order
public class Question13 {
    public static void main(String[] args) {
        int num=3789;
        int flag=1;
        int prev=10;

        while(num>0){
            int curr= num%10;
            if(curr>prev){
                flag=0;
                break;
            }
            prev=curr;
            num/=10;
        }

        if(flag==1){
            System.out.println("Digits are in ascending order");
        }
        else{
            System.out.println("Digits are not in ascending order");
        }
    }
}
