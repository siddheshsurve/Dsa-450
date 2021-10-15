import java.util.Scanner;

public class sumOfEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :\t");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                sum = sum+i;
            }
        }

        System.out.println("\n"+sum);

    }
}
