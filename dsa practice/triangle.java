import java.util.Scanner;

class triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter lenght of triangle's side1 :\t");
        int s1 = sc.nextInt();
        System.out.print("Enter lenght of triangle's side2 :\t");
        int s2 = sc.nextInt();
        System.out.print("Enter lenght of triangle's side3 :\t");
        int s3 = sc.nextInt();

        if(s1 == s2 && s1 == s3){
            System.out.println("\nIts an Equilateral triangle...");
        } else if(s1 == s2 || s1 == s3 || s2 == s3){
            System.out.println("\nIts an Isosceles triangle...");
        } else{
            System.out.println("\nIts an Scalene triangle...");
        }
        

    }
}