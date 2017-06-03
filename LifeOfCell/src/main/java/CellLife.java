import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/3.
 */
public class CellLife {
    private static final char life = '*';
    private static final char dead = '-';

    public void inputCellOfArray(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] cellArray = new int[n][n];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                cellArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            cellArray[0][i] = dead;
            cellArray[i][0] = dead;
            cellArray[n-1][i] = dead;
            cellArray[i][n-1] = dead;
        }
    }

    public  int
    public int[][] trans(int[][] array){


    }

    public int neighbors(int row ,int col){


    }

    public void output(int[][] array){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j] + " ")
            }
            System.out.println();

        }

    }
}
