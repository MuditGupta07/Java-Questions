//Print All digits of the number
public class Question1 {
    public static void main(String[] args) {
        int num=265;
        int n=num;
        int d=0;
        while(n>0){
            n/=10;
            d++;
        }
        n=num;
        int Pow = (int)Math.pow(10, (d-1));
        while(n>0){
            int temp= n/Pow;
            n%=Pow;
            Pow/=10;
            System.out.print(temp+" ");
        }

        //2nd method using string 
        String str1= num+"";
        //String str2= String.valueOf(num);
        System.out.println();
        System.out.println(str1);
        for(int i=0;i<str1.length();i++){
            System.out.print(str1.charAt(i) + " ");
        }
    }
}
