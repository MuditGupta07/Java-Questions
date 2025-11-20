//Count even and odd number between 1 to n
public class Question20 {
    static void count_even_odd(int n,int e, int o){
        if(n==0){
            System.out.println("Even Numbers: "+e);
            System.out.println("Odd Numbers: "+o);
            return;
        }
        if(n%2==0){
            e++;
        }
        else{
            o++;
        }
        count_even_odd(n-1, e, o);
    }
    public static void main(String[] args) {
        count_even_odd(5,0,0);
    }
}
