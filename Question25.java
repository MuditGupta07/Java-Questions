//Table of the number using recursion
public class Question25 {
    static void table(int n, int count){
        if(count==0){
            return;
        }
        table(n,count-1);
        System.out.println(n + " * " + count + " = "+(n*count));
    }

    static String table2(int n, int count){
        if(count==0){
            return "";
        }
        String cs= n + " * " + count + " = "+(n*count)+ "\n";
        String rs= table2(n,count-1);
        return rs+cs;
        
    }
    public static void main(String[] args) {
        table(5,10);

        String r= table2(5,10);
        System.out.println(r);
    }
}
