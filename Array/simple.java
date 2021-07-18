class simple{
    public static void main(String[] args) {
        //declare
        int[] arr;

        //allocate memory for 5 ints
        arr = new int[5];

        //initialize all elements of array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //accessing the elements 
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elements at index "+i+ " : " + arr[i]);
        }
    }
}