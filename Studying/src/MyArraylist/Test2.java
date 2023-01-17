package MyArraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/18 4:10
 */
public class Test2 {

    public static List<Character> func(String s1,String s2) {

        if (s1 == null || s2 == null) {
            return null;
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return null;
        }

        List<Character> result = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!s2.contains(ch + "")){
                result.add(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        List<Character> ret = func(s1,s2);
        for (char ch : ret) {
            System.out.print(ch);
        }
        System.out.println();
    }

}
