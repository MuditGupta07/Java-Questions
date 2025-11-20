//Count Number to String
public class Question29{
    static String numToInt(int num){
        if(num==0){
            return "";
        }
        int n= num%10;
        String cs="";
        // if(n==1){
        //      cs="One ";
        // }
        // else if(n==2){
        //     cs="Two ";
        // }
        // else if(n==3){
        //     cs="Three ";
        // }
        // else if(n==4){
        //     cs="Four ";
        // }
        // else if(n==5){
        //     cs="Five ";
        // }
        // else if(n==6){
        //     cs="Six ";
        // }
        // else if(n==7){
        //     cs="Seven ";
        // }
        // else if(n==8){
        //     cs="Eight ";
        // }
        // else if(n==9){
        //     cs="Nine ";
        // }
        // else{
        //     cs="Zero ";
        // }

        switch(n){
            case 0:
                cs="Zero ";
                break;
            case 1:
                cs="One ";
                break;
            case 2:
                cs="Two ";
                break;
            case 3:
                cs="Three ";
                break;
            case 4:
                cs="Four ";
                break;
            case 5:
                cs="Five ";
                break;
            case 6:
                cs="Six ";
                break;
            case 7:
                cs="Seven ";
                break;
            case 8:
                cs="Eight ";
                break;
            case 9:
                cs="Nine ";
                break;
            default:
                break;
        }
       
        String rs=numToInt(num/10);
        return rs+cs;
    }
    public static void main(String[] args){
        System.out.println(numToInt(1321));
    }
}
