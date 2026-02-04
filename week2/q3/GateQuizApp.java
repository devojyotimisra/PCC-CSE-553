// GATE Exam: 
// Display the multiple choice questions and timer. 
// Take input of answers from the user and finally show the result (marks obtained, correct, incorrect). 

import java.util.*;

class GateQuizApp 
{    
    static String input = null;

    public static void main(String[] args) throws Exception 
    {
        new Thread(() -> { 
            Scanner s = new Scanner(System.in);
            while (true) 
            {
                input = s.nextLine();
            }
        }).start();

        System.out.println("Quiz Started! (10 seconds per question)\n");
        
        int score = 0;

        System.out.println("1. What is 2 + 2?");
        System.out.println("1) 3\n2) 4\n3) 5\n4) 6");
        System.out.print("Answer: ");
        
        input = null;
        for (int i = 0; i < 10000; i++) 
        {
            if (input != null) 
            {
                    break;
            }
            Thread.sleep(1);
        }

        if (input == null) 
        {
            System.out.println("\nTime's up!");
        } 
        else 
        {
            if (input.equals("2")) 
            {
                System.out.println("Correct!");
                score++;
            } 
            else 
            {
                System.out.println("Wrong!");
            }
        }

        System.out.println("2. What is the capital of India?");
        System.out.println("1) Mumbai\n2) Delhi\n3) Kolkata\n4) Chennai");
        System.out.print("Answer: ");

        input = null;
        for (int i = 0; i < 10000; i++) 
        {
            if (input != null) 
            {
                break;
            }
            Thread.sleep(1);
        }

        if (input == null) 
        {
            System.out.println("\nTime's up!");
        } 
        else 
        {
            if (input.equals("2")) 
            {
                System.out.println("Correct!");
                score++;
            } 
            else 
            {
                System.out.println("Wrong!");
            }
        }

        System.out.println("Final Score: " + score + "/2");
        System.exit(0);
    }
}
