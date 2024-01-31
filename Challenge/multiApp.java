package Challenge;

public class multiApp {
    public static void main(String[] args) {
        int mynum = 1;
        System.out.println("Multiplication Table ");
        for(int i = 1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(mynum*j+"\t");
            }
            mynum++;
            System.out.print("\n");
        }
    }
}