package Challenge;

import java.util.Arrays;

//userAuthentication
public class gcashBank {
    public static void main(String[] args) {
            // Retrieve an item from an array
        int myArray[] = new int[]{1,2,3};
        System.out.println(myArray[0]); // Outputs 1

        // Update an item in an array
        myArray = new int[]{4, 5, 6};
        myArray[0] = 7;
        System.out.println(Arrays.toString(myArray)); // Outputs {7,5,6}

        // clearing an array
        myArray = null;
        System.out.println(Arrays.toString(myArray)); // Outputs null
    }

}

