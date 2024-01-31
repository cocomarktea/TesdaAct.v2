package Challenge;
import java.util.Arrays;
import java.util.Scanner;

public class threeInt {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Input 3 numbers separated by spaces: ");
        for(int i = 0;i<nums.length;i++){nums[i] = myObj.nextInt();}
        if(nums[0]==nums[1] && nums[0]==nums[2]){
            System.out.println("Entered numbers where Equal!");
        }else{Arrays.sort(nums);
            System.out.println("Largest number is: "+nums[2]);
        }
        myObj.close();
    }
}