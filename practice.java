import java.util.Scanner;
class sum{
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter your first number");
        int num1= sc.nextInt();
        System.out.println("Enter your second number");
        int num2= sc.nextInt();
        int sum= num1+num2;
        System.out.println("Your answer is "+ sum);
        sc.close();
    }
}