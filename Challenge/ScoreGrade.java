package Challenge;
//Tasksheet 1-1-4

import java.util.Scanner;

class ScoreGrade {
    public static void main(String[] args) {
        Scanner myScore = new Scanner(System.in);
        System.out.print("Please enter your score: "); // Display the string.
        
        int score = myScore.nextInt();
        if(score < 60){
            System.out.println("Your grade is F");
        }else if(score >= 60 && score <= 69){
            System.out.println("Your grade is D");
        }else if(score >= 70 && score <= 79){
            System.out.println("Your grade is C");
        }else if(score >= 80 && score <= 89){
            System.out.println("Your grade is B");
        }else{
            System.out.println("Your grade is A");
        }
        myScore.close();
    }
}