//Task 2 STUDENT GRADE CALCULATOR

import java.util.*;
class Task2{
    static String grade(int a){
        if (a>=91 && a<=100){
            return "A";
        }
        else if (a>=81 && a<=90){
            return "B";
        }
        else if (a>=71 && a<=80){
            return "C";
        }
        else if (a>=61 && a<=70){
            return "D";
        }
        else if (a>=51 && a<=60){
            return "E";
        }
        return "F";
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int sum_all_sub=0,avg=0,total_subj=10;
        System.out.print("Enter your marks in Subject A:(out of 100) ");
        int a = obj.nextInt();
        System.out.print("Enter your marks in Subject B:(out of 100) ");
        int b = obj.nextInt();
        System.out.print("Enter your marks in Subject C:(out of 100) ");
        int c = obj.nextInt();
        System.out.print("Enter your marks in Subject D:(out of 100) ");
        int d = obj.nextInt();
        System.out.print("Enter your marks in Subject E:(out of 100) ");
        int e = obj.nextInt();
        System.out.print("Enter your marks in Subject F:(out of 100) ");
        int f = obj.nextInt();
        System.out.print("Enter your marks in Subject G:(out of 100) ");
        int g = obj.nextInt();
        System.out.print("Enter your marks in Subject H:(out of 100) ");
        int h = obj.nextInt();
        System.out.print("Enter your marks in Subject I:(out of 100) ");
        int i = obj.nextInt();
        System.out.print("Enter your marks in Subject J:(out of 100) ");
        int j = obj.nextInt();
        sum_all_sub = a+b+c+d+e+f+g+h+i+j;
        avg = sum_all_sub/total_subj;
        
        String z = grade(avg);
        System.out.println("Your total marks are "+sum_all_sub+" out of 1000");
        System.out.println("Your average percentage is "+avg+" out of 100%");
        System.out.println("Your Grade is "+z);
        System.out.println(avg);
    }
}