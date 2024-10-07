import java.util.Scanner;
public class flowchartNo2daspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day, bookCategory;
        int numberOFBook;
        double discount;

        System.out.print("Input day               : ");
        day = sc.nextLine();
        System.out.print("Input book category     : ");
        bookCategory = sc.nextLine();
        System.out.print("Input number of book    : ");
        numberOFBook = sc.nextInt();

        if(day.equalsIgnoreCase("wednesday")){
            if(bookCategory.equalsIgnoreCase("dictionary") || bookCategory.equalsIgnoreCase("novel")){
                if(bookCategory.equalsIgnoreCase("dictionary")){
                    if(numberOFBook>2){
                    System.out.println("discount 10% + discount 2%");
                    }else if(numberOFBook<=2 && numberOFBook>=1){
                    System.out.println("didn't get any extra discount only get discount 10%");
                    }
               }else if(bookCategory.equalsIgnoreCase("novel")){
                    if(numberOFBook>3){
                    System.out.println("discount 7% + discount 2%");
                    }else if(numberOFBook<=3 && numberOFBook>=1){
                    System.out.println("discount 7% + discount 1%");
                    }
                }
            }else if(numberOFBook>3){
                System.out.println("another category of books get discount 5%");
            }else if(numberOFBook<=3 && numberOFBook>=1){
                System.out.println("another category of books didn't get discount");
            }
        }else{
            System.out.println("No discount other than wednesday");
        }
    }
}