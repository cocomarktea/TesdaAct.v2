package Challenge;

import java.util.Scanner;

public class sumAndAvg {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] nums = new int[3];
        int sumTotal = 0;
        System.out.println("Input 3 numbers separated by spaces: ");
        for(int i = 0;i<nums.length;i++){
            nums[i] = myObj.nextInt();
        }
        for(int i =0;i<3;i++){
            sumTotal+=nums[i];
        }
        double avg = (double)sumTotal/3;
        System.out.println("Total sum: "+sumTotal+"\nAverage: "+avg);
        myObj.close();
    }
}
