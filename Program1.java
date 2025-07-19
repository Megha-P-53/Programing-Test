package in.Megha.test;
import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double operator(String ope) {
        switch (ope) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation.");
                return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter operation (+,-,*,/): ");
        String ope = sc.nextLine();
        Calculator cal = new Calculator(a, b);
		double res = cal.operator(ope);
        System.out.println("Result: " + res);
        sc.close();
    }
}

