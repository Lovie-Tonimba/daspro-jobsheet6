import java.util.Scanner;
public class Selection2Exp2244107060101 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;

        System.out.print("Input angle 1 = ");
        angle1 = input10.nextInt();
        System.out.print("Input angle 2 = ");
        angle2 = input10.nextInt();
        System.out.print("Input angle 3 = ");
        angle3 = input10.nextInt();

        totalAngle = angle1 + angle2 + angle3;
        //Modification no1 experiment 2
        if(totalAngle == 180){
            if(angle1==90 || angle2==90 || angle3==90){
                System.out.println("Right triangle");
            }else if(angle1==60 && angle2==60 && angle3==60){
                System.out.println("Equilateral triangle");
            }else if(angle1==angle2 || angle1==angle3 || angle2==angle3){
                System.out.println("Isosceles triangle");
            }else{
                System.out.println("Arbitrary triangle");
            }
        }else {
            System.out.println("Not a triangle");
        }
        // if(totalAngle == 180){
        //     if(angle1==90 || angle2==90 || angle3==90){
        //         System.out.println("Right triangle");
        //     }else{
        //         System.out.println("Not a right triangle");
        //     }
        // }else{
        //     System.out.println("Not a triangle");
        // }
  }
}