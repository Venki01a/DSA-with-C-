import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print(x:"Enter the number  of rows: ");
        int rows = in.nextInt();
        System.out.print(:"Enter the number of columns: ");
        int columns = i.nextInt();
        if(rows!=columns) 
        {
            System.out.println("Matrix is not symmetric as it is not a square matrix.");
            return;
        }

        int [][] arr = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int [][] transpose= new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[i][j]=arr[j][i];
            }
     }
        
        System.out.println("The Transpose of 2D array is:");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
               System.out.print(transpose[i][j] + " ");
            }
        }
        else{
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j] =! transpose[j][i]){
                    data = false;
                    break;
                }
            }
        }
        }
        if(data){
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}