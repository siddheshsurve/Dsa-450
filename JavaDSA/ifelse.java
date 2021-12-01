import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        System.out.println("Enter your salary :");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if (salary > 20000){
            salary += 3000;
        } else if (salary >10000){
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

    }
}