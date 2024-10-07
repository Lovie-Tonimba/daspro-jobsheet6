import java.util.Scanner;
/**
 * Selection2Exp1244107060101
 */
public class Selection2Exp1244107060101 {

    public static void main(String[] args) {
        Scanner input244107060101 = new Scanner(System.in);
        
        int year;
        System.out.print("Input year: ");
        year = input244107060101.nextInt();

        if(year%4 == 0) {
            if(year%100 != 0) {
                System.out.println("Leap year");
            }else{
                System.out.println("Not a leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }
    }
}