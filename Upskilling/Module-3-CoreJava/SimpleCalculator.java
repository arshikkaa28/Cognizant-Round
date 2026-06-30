import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Nummber:");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation (+,-,*,/)");
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+':
                System.out.println("Addition of two numbers is:"+ (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers is: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers is:" +(num1*num2));
                break;
            case '/':
                if(num2!=0){
                    System.out.println("Division of two numbers is:" +(num1/num2));
                }else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
        }
    }
}