import java.util.Scanner;
class input{
    public static void main(String[] args) {
        System.out.println("Taking input :");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        int a = sc.nextInt();

        System.out.println("Enter number2 : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of these numbers is : "+ sum);

    }
}