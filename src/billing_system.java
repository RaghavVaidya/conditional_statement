import java.util.Scanner;

public class billing_system { //only 1 item at a time, quantity, bill=quantity*price
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your order");
        int order= sc.nextInt();
        System.out.println("Enter the quantity");
        int quantity= sc.nextInt();
        if(order==1){
            System.out.println("Chowmein is ordered with quantity:"+quantity);
            int price=150;
            int bill=quantity*price;
            System.out.println("Your bill is "+bill);
        }
        else if(order==2){
            System.out.println("Mo:MO is ordered with quantity:"+quantity);
            int price=170;
            int bill=quantity*price;
            System.out.println("Your bill is "+bill);
        }
        else if(order==3){
            System.out.println("Burger is ordered with quantity:"+quantity);
            int price=120;
            int bill=quantity*price;
            System.out.println("Your bill is "+bill);
        }

    }
}
