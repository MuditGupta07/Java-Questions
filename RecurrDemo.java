public class RecurrDemo {
    static void greet(String name, int count){
        //Base case/ Termination Case
        if(count==5){
            return;
        }

        System.out.println("Welcome "+name+" : "+count);
        greet(name,count+1);
        System.out.println("Welcome "+name+" : "+count);
    }
    public static void main(String[] args) {
        greet("Ramesh",0);
    }
}