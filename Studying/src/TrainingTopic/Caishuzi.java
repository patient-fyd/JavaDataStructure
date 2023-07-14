package TrainingTopic;

import java.util.Scanner;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 实现猜数字游戏
 * @DateTime: 2023/7/14 19:13
 */
public class Caishuzi {
    public static void main(String[] args) {
        // 生成一个1-100的随机数
        int random = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你猜的数字：");
            int guessNumber = sc.nextInt();
            // 判断用户输入的数字和随机数是否相等
            if(guessNumber == random){
                System.out.println("恭喜你，猜中了！");
                // 选择是否继续游戏输入y或者Y继续，其他任意键退出
                System.out.println("是否继续游戏？（输入y或者Y继续，其他任意键退出）");
                String answer = sc.next();
                if(answer.equals("y") || answer.equals("Y")){
                    random = (int) (Math.random() * 100 + 1);
                    continue;
                }else {
                    System.out.println("游戏结束！");
                    return;
                }
            }
            // 判断用户输入的数字和随机数的大小
            if(guessNumber > random){
                System.out.println("你猜的数字大了");
            }else{
                System.out.println("你猜的数字小了");
            }
        }
    }
}
