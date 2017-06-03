import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/3.
 */
public class CellLife {
    public void inputCellOfArray(){
        Scanner scanner = new Scanner(System.in);
        int[][] cellArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cellArray[i][j] = scanner.nextInt();
            }
        }
    }
    public int[][] trans(int[][] array){

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
