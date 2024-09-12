package Codesoft;
import java.util.*;
public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Total_Marks=0;
        float Avg_Marks_Percentage;
        System.out.print("Enter no of subjects :");
        int n=sc.nextInt();
        int Marks[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter marks of subject "+(i+1)+" out of 100 : ");
            Marks[i]=sc.nextInt();
            Total_Marks=Total_Marks+Marks[i];
        }
        System.out.println("Total Marks : "+Total_Marks);
        Avg_Marks_Percentage=(float)Total_Marks/n;
        System.out.println("Average Percentage : "+Avg_Marks_Percentage+"%");
        if(Avg_Marks_Percentage>=90){
            System.out.println("Grade A");
        }
        else if(Avg_Marks_Percentage>=80){
            System.out.println("Grade B");
        }
        else if(Avg_Marks_Percentage>=70){
            System.out.println("Grade C");
        }
        else if(Avg_Marks_Percentage>=60){
            System.out.println("Grade D");
        }
        else if(Avg_Marks_Percentage>=50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
        sc.close();
    }
}