import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :\t");
        int n = sc.nextInt();

        int prime = 0;
        for(int i=0;i<=n;i++){
            if(i%2 != 0){
                if(i%3 != 0){
                    if(i%5 != 0){
                        if(i%7 != 0){
                            if(i%9 != 0){
                                prime = prime + i;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(prime);
    }
}
