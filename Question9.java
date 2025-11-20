// Flip the digits and positions
public class Question9 {
    public static void main(String[] args) {
        int num=54123;
        int n=num;
        int new_number=0;
        int pos=1;
        while(n>0){
            int last_digit= n%10;
            int current_pos= pos*((int)Math.pow(10,last_digit-1));
            new_number+=current_pos;
            pos++;
            n/=10;
        }
        System.out.println(new_number);
    }    
}
