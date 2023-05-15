public class Adding_two_matrix {
    public static void main(String[] args){
        int [][] mat1= {{1,2,3},{2,9,7}};
        int [][] mat2= {{9,7,4},{2,2,6}};
        int [][] result = {{0,0,0},{0,0,0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j]=mat1[i][j]+mat2[i][j];

            }
        }
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
