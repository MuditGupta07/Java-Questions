//Print all digits of a number using recurrsion
public class Question17 {
    static void Display(int n){
        if(n==0){
            return;
        }
        int ld= n%10;
        Display(n/10);
        System.out.println(ld);
    }
    public static void main(String[] args) {
        Display(65214);
    }    
}
