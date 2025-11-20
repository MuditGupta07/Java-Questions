//Count zeroes using recursion
public class Question28{
    static int count=0;
    static int count_zero(int num){
        if(num==0){
            return 0;
        }
        int ld= num%10;
        if(ld==0){
            count++;
        }
        count_zero(num/10);
        return count;
    }
    public static void main(String[] args){
        System.out.println(count_zero(158150));
    }
}
