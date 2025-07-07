import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print(x:"Enter the number  of rows: ");
        int rows = in.nextInt();
        System.out.print(:"Enter the number of columns: ");
        int columns = i.nextInt();
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

        int max = arr[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in the 2D array is: " + max);
    }
}