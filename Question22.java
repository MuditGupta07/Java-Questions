//Count number of digits using recurrsion
public class Question22 {
    static int countdigits(int num, int count){
        if(num==0){
            return count;
        }
        count++;
        return countdigits(num/10,count);
    }
    public static void main(String[] args) {
        int n=countdigits(45816,0);
        System.out.println("Number of digits= "+n);
    }
}