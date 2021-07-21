import java.util.Scanner;
class reverseArrayIterative{

    public static void printArray(int[] arr, int size) {
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array you entered : ");
        printArray(arr, size);
        reverseArray(arr, 0, size-1);
        System.out.print("Reversed array : ");
        printArray(arr, size);
        
        
    }

    
}