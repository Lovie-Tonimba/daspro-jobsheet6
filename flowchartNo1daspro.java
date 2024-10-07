import java.util.Scanner;
public class flowchartNo1daspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num1, num2, num3;

        System.out.print("Number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Number 2 : ");
        num2 = sc.nextInt();
        System.out.print("Number 3 : ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("maximum number = " + num1);
            }else {
                System.out.println("maximum number = " + num3);
            }
        } else if (num2 > num3) {
                System.out.println("maximum number = " + num2);
            }else {
                System.out.println("maximum number = " + num3);
            }
    }
}