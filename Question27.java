//Convert decimal to binary using recursion
public class Question27{
    static int count=0;
    static int convert(int num){
        if(num==0){
            return 0;
        }
        int n= (num%2)*(int)Math.pow(10,count);
        count++;
        return n+convert(num/2);
    }
    public static void main(String[] args){
        System.out.println(convert(5));
    }
}
