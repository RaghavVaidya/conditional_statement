import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        if(num1>0){
            System.out.println(num1+" is positive");
        }
        else if(num1==0) {
            System.out.println(num1+"is zero");
        }
        else{
            System.out.println(num1+" is negative");
        }

    }
}
