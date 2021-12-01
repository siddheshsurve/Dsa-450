import java.util.Scanner;

public class loops{
    public static void main(String[] args) {
        System.out.println("Enter the number up to which you want to print numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Result : ");
        // for(int i=1; i <= num; i++){
        //     System.out.print(i + " ");
        // }

        //while loop
        int i = 1;
        while(i <= num){
            System.out.print(i + " ");
            i++;
        }
    }
} 