package Tasksheet;

public class ControlFlow {
    public static void main(String[] args) {
        System.out.println("Odd and Even numbers"); // Display the string.

        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i+" is even number!");
            }
            else{
                System.out.println(i+" is odd number!");
            }
        };
    }
}
