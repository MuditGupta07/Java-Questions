//Check whether an element is present in the array or not
public class Question33{
    static boolean isPresent(int[] arr, int i,int target){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return isPresent(arr,i+1,target);
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(isPresent(arr,0,5));
    }
}