//Check palindrome using recursion
public class Question19 {
    static boolean palindrome(int og, int cn, int rev){
        if(cn==0){
            return og==rev;
        }
        rev= rev*10 + (cn%10);
        return palindrome(og, cn/10, rev);
    }
    public static void main(String[] args) {
        System.out.println(palindrome(111,111,0));
    }
}
