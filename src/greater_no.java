import java.util.Scanner;

public class greater_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= sc.nextInt();
        System.out.println("Enter another number");
        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is greater");
        }
        else if(num1==num2){
            System.out.println("They are equal");
        }
        else{
            System.out.println(num2+" is greater");
        }
    }
}
