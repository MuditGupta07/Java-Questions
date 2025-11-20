//Check given array is sorted or not
public class Question32{
    static boolean isSorted(int[] arr, int i, String order){
        if(i==arr.length){
            System.out.println(order);
            return true;
        }
        if(order== null){
            if(arr[i]>arr[i-1]){
                order="asc";
            }
            else if(arr[i]<arr[i-1]){
                order="desc";
            }
        }
        else{
            if(order=="asc"){
                if(arr[i]<arr[i-1]){
                    return false;
                }
            }
            else if(order=="desc"){
                if(arr[i]>arr[i-1]){
                    return false;
                }
            }
        }
        
        return isSorted(arr,i+1,order);
    }
    public static void main(String[] args){
        int[] arr={40,30,21,10};
        System.out.println(isSorted(arr,1,null));
    }
}