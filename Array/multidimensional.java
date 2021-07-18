class multidimensional{
    public static void main(String[] args) {
        
        //declaration
        int[][] arr = {{3,6,9},{4,8,12},{5,10,15}};

        //traverse and print
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}