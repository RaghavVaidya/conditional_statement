import java.util.Scanner;

public class div_by3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%3==0){
            System.out.println(num+" is divisible by 3");
        }
        else{
            System.out.println(num+" is not divisible by 3");
        }
    }
}
