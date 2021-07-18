class arrayToMethod{
    public static void main(String[] args) {
        //declare array
        int[] arr = {1,6,21,66,201,606};

        //pass to method sum
        sum(arr);
    }
    public static void sum(int[] arr) {
        //sum variable for calculating sum
        int sum = 0;

        //calculating sum 
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array elements is "+sum);

    }
}