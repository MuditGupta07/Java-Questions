//Power of a number using recursion
public class Question23 {
    static int power(int n, int pow){
        if(pow==0){
            return 1;
        }
        return n*power(n,pow-1);
    }
    public static void main(String[] args) {
        System.out.println("Answer= "+power(5,3));
    }
}
