import java.util.Scanner;
public class flowchartNo3daspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand, category;
        int size;

        System.out.print("Input brand     :");
        brand = sc.nextLine();
        System.out.print("Input category  :");
        category = sc.nextLine();
        System.out.print("Input size      :");
        size = sc.nextInt();

        if(brand.equalsIgnoreCase("converse")){
            if(category.equalsIgnoreCase("slip on")){
                if(size>=36){
                    if(size<=40){
                        System.out.println("Price Rp 800.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else if(category.equalsIgnoreCase("high top")){
                if(size>=40){
                    if(size<=44){
                        System.out.println("Price Rp1.200.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else{
                System.out.println("Cannot identify data\nThis category of brand converse is not available in the shoe store");
            }
        }else if(brand.equalsIgnoreCase("sketcher")){
            if(category.equalsIgnoreCase("woman")){
                if(size>=36){
                    if(size<=41){
                        System.out.println("Price Rp 1.000.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else if(category.equalsIgnoreCase("man")){
                if(size>=41){
                    if(size<=44){
                        System.out.println("Price 1.800.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else{
                System.out.println("cannot identify data\nThis category of brand sketcher is not available in the shoe store");
            }
        }else if(brand.equalsIgnoreCase("nike")){
            if(category.equalsIgnoreCase("kids")){
                if(size>=36){
                    if(size<=40){
                        System.out.println("Price Rp 750.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else if(category.equalsIgnoreCase("adult")){
                if(size>=40){
                    if(size<=44){
                        System.out.println("Price 1.500.000");
                    }else{
                        System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                    }
                }else{
                    System.out.println("Cannot identify data\nThis size is not available in the shoe store");
                }
            }else{
                System.out.println("Cannot identify data\nThis category of brand nike is not available in the shoe store");
            }
        }else{
            System.out.println("Cannot identify the data\nThis brand is not available in the shoe store");
        }
    }
}