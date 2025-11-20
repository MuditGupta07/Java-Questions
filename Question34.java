//Search an element in array, find all the occurance
import java.util.Arrays;
public class Question34{
    static int[] occurance(int[] arr, int i, int count, int target){
        if(i==arr.length){
            // System.out.println("Base Case: "+count);
            return new int[count];
        }
        if(arr[i]==target){
            count++;
        }
        int[] res= occurance(arr, i+1, count, target);
        // System.out.println("Index: "+i+" Count: "+count+Arrays.toString(res));
        if(arr[i]==target){
            res[count-1]=i;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={10,50,14,10};
        int[] ans = occurance(arr,0,0,10);
        System.out.println(Arrays.toString(ans));
    }
}