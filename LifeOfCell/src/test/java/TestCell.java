import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/3.
 */
public class TestCell {
    @Test
    public void testInput(){
        CellLife cellLife = new CellLife();
        char [][] array = cellLife.inputCellOfArray();
        String str = "------***--***--***------";

        //Assert.assertArrayEquals(array,result);
    }

    @Test
    public void testTrans(){
        CellLife cellLife = new CellLife();
        String str = "-------*----*----*-------";
        int index = 0;
        char[][] result = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                result[i][j] = str.charAt(index++);
            }
        }
        char[][] array = cellLife.inputCellOfArray();
        Assert.assertArrayEquals(cellLife.trans(array),result);
    }
}
