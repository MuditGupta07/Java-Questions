//Rotation of a number
public class Question11 {
    public static void main(String[] args) {
        int num=12345;
        int rotate= -7;
        int n=num;
        int count=0;

        while(n>0){
            count++;
            n/=10;
        }
        rotate%=count;
        if(rotate<0){
            rotate=count+rotate;
            rotate=Math.abs(rotate);
        }
        
        int rem= num%((int)Math.pow(10,rotate));
        rem*=(int)Math.pow(10,(count-rotate));

        int quo= num/((int)Math.pow(10,rotate));
        int new_number= rem+quo;
        System.out.println(new_number);
    }
}
