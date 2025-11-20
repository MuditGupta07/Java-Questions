// Check if All Digits Are Unique
import java.util.HashSet;
public class Question7 {
    public static void main(String[] args) {
        int num=4533261;
        int flag=1;
        HashSet<Integer> Hash= new HashSet<Integer>();
        while(num>0){
            int ld= num%10;
            if(Hash.contains(ld)){
                flag=0;
                break;
            }
            else{
                Hash.add(ld);
            }
            num/=10;
        }
        if(flag==1){
            System.out.println("All digits are unique");
        }
        else{
            System.out.println("All didgits are not unique");
        }

    }
}
