import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/3.
 */
public class CellLife {
    private static final char life = '*';
    private static final char dead = '-';
    static char[][] cellArray = new char[12][12];
    static char[][] cellCopy = new char[12][12];

    public char[][] inputCellOfArray() {
        //String str = "-----------***-----------";
        String str = "------------" +
                     "---*---*-*--" +
                     "---*---*----" +
                     "------*-----" +
                     "-----**-----" +
                     "-----**-----" +
                     "---*-----*--" +
                     "----*--*----" +
                     "---*---**---" +
                     "--*-----*---" +
                     "---*----*---" +
                     "------------";

        int index = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                cellArray[i][j] = str.charAt(index++);
                cellCopy[i][j] = dead;
            }
        }
        return cellArray;
    }

    public void circu (char[][] array,int m) {
        char[][] next = new char[12][12];
        for (int i = 0; i < m; i++) {
            next = trans(array);
            output(next);
            array = next;
        }
    }


    public char[][] trans(char[][] cellArray) {
            int life_num = 0;
            for (int i = 1; i < 11; i++) {
                for (int j = 1; j < 11; j++) {
                    life_num = neighbors(i, j);
                    switch (life_num) {
                        case 0:
                        case 1:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            cellCopy[i][j] = dead;
                            break;
                        case 2:
                            cellCopy[i][j] = cellArray[i][j];
                            break;
                        case 3:
                            cellCopy[i][j] = life;
                            break;
                    }
                }
            }
        return copy(cellCopy);
    }

    public int neighbors(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++)
                if (cellArray[i][j] == life)
                    count++;
        }
        if (cellArray[row][col] == life)
            count = count - 1;
        return count;
    }

    public char[][] copy(char[][] array) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                cellArray[i][j] = cellCopy[i][j];
            }
        }
        return cellArray;
    }

    public void output(char[][] array) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        CellLife cellLife = new CellLife();
        cellLife.output(cellLife.inputCellOfArray());
        cellLife.circu(cellArray,2);
    }
}
