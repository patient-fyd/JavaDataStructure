package MyArraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 杨辉三角
 * @DateTime: 2023/1/18 3:39
 */
public class Test1 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);

        ret.add(one);

        // i代表每一行
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            // 这一行开始的1
            curRow.add(1);
            // j代表这一行的每个元素
            for (int j = 1; j < i; j++) {
                //curRow[i][j] = [i-1][j] + [i-1][j-1];
                List<Integer> preRow = ret.get(i-1);

                int x = preRow.get(j) + preRow.get(j-1);
                curRow.add(x);
            }

            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }

}
