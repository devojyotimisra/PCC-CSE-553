// Student Grading System: 
// Display the grade of each student along with pass/fail of each subject. 
// Take necessary input from the user. 
// Theory subject passing criteria : Marks >= 40. 
// Practical subject passing criteria : Marks >= 50. 
// Implement both B.E and M.E students. 
// B.E. marks = Midterm(15) + Assignment&Attendance(15) + Endterm(70).  
// M.E. marks = Assignment&Attendance(30) + Endterm(70)

import java.util.*;

class StudentGradingSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Type (BE or ME): ");
        String studentType = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter Number of Subjects: ");
        int totalSubjects = sc.nextInt();
        
        for(int i=1; i<=totalSubjects; i++)
        {
            System.out.println("\nSubject " + i);
            System.out.print("Subject Type (Enter T for Theory, P for Practical): ");
            String subType = sc.next().trim().toUpperCase();
            
            float marks = 0;
            
            if (studentType.equals("BE")) 
            {
                 System.out.print("Enter Midterm Marks (max 15): ");
                 float mid = sc.nextFloat();
                 System.out.print("Enter Assignment & Attendance Marks (max 15): ");
                 float assig = sc.nextFloat();
                 System.out.print("Enter Endterm Marks (max 70): ");
                 float end = sc.nextFloat();
                 marks = mid + assig + end;
            } 
            else 
            {
                 System.out.print("Enter Assignment & Attendance Marks (max 30): ");
                 float assig = sc.nextFloat();
                 System.out.print("Enter Endterm Marks (max 70): ");
                 float end = sc.nextFloat();
                 marks = assig + end;
            }
            
            boolean isPassed = false;

            if (subType.equals("P")) 
            {
                if (marks >= 50) 
                {
                        isPassed = true;
                }
            } 
            else 
            {
                if (marks >= 40)
                {
                    isPassed = true;
                }
            }
            
            String grade;

            if(marks >= 90)
            {
                grade = "EX";
            }
            else if(marks >= 80)
            {
                grade = "O";
            }
            else if(marks >= 70)
            {
                grade = "A";
            }
            else if(marks >= 60)
            {
                grade = "B";
            }
            else if(marks >= 50)
            {
                grade = "C";
            }
            else if(marks>= 40)
            {
                if(isPassed)
                {
                    grade = "D";
                }
                else
                {
                    grade = "F";
                }
            }
            else
            {
                grade = "F";
            }
            
            System.out.println("Total Marks: " + marks);
            System.out.println("Grade: " + grade);
            System.out.println("Result: " + (isPassed ? "PASS" : "FAIL"));
        }
        sc.close();
    }
}
