class MultiplyMatrices{
    int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
    int [][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
    int[][] resultMatrix = new int[3][3];
    
    public void multiply(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    resultMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
    }
    
    public void displayresult(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Operation{
    public static void main(String[]args){
        MultiplyMatrices m = new MultiplyMatrices();
        m.multiply();
        m.displayresult();

    }
}
