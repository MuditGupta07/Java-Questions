//Longest sub array length
public class Question31{
    static int longest(int[] arr, int i, int count, int max){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>arr[i-1]){
            max=Math.max(max,count);
            count=0;
        }
        
        max=Math.max(max,count+1);
        return longest(arr, i+1, count+1, max);
    }
    public static void main(String[] args){
        int[] arr={1,1,1,1,1,2,2,3,3,3,4,4};
        // int Max=0;
        // int count=1;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>arr[i-1]){
        //         Max=Math.max(Max,count);
        //         count=0;
        //     }
        //     count++;
        //     Max=Math.max(Max,count);
            
        // }
        // System.out.println(Max);
        System.out.println(longest(arr,1,1,0));
    }
}