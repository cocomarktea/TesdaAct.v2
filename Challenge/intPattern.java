package Challenge;
import java.util.Scanner;
public class intPattern {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input number: ");
        int num1 = myObj.nextInt();
        for(int i = 1;i<=num1;i++){
            System.out.print("\n");
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
    }
}
