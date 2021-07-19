import java.util.Scanner;
class arrayInput{
    public static void main(String[] args) {

        int n;
        System.out.println("---------------------------------------------");
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("---------------------------------------------");
        System.out.println("Enter elements for your array :\n ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter "+(i+1)+"st element : ");
            arr[i] =  sc.nextInt();
        }
        System.out.println("---------------------------------------------");
        System.out.println("Your array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
            System.out.print("\t");
        } 
        System.out.println(); 
        System.out.println("---------------------------------------------");    
    }
}