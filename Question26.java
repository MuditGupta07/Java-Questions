//Convert binary to decimal using recursion
public class Question26{
    static int count=0;
    static int convert(int num){
        if(num==0){
            return 0;
        }
        int n= (num%10)*(int)Math.pow(2,count);
        count++;
        return n+convert(num/10);
    }
    public static void main(String[] args){
        System.out.println(convert(100110));
    }
}
