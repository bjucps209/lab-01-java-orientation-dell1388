import java.util.*;
public class Grader{
    public static void main(String[] args){
       var scan = new Scanner(System.in);
       int studNum = Integer.parseInt(scan.nextLine());
       int grade=0; 
       for (int i=0;i < studNum; i++){
       grade= Integer.parseInt(scan.nextLine());
        while ((0 > grade) || (grade > 100)){
            System.out.println("Grade Invalid");
       grade = Integer.parseInt(scan.nextLine());
        }
       if ((grade >= 38) && ( grade % 5 > 2)){
           grade = grade - (grade % 5) + 5;
       }
       System.out.println(grade);
       }
    }
}
