package TrainingTopic.stack;

import java.util.Stack;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 给你一个字符串数组 tokens ，表示一个根据 逆波兰表示法 表示的算术表达式。
 * @DateTime: 2023/3/8 11:04
 */
public class Test1 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        //1、遍历这个字符串，如果是数字字符串，入栈。不是，出栈。

        for(int i = 0;i < tokens.length;i++){
            String x = tokens[i];
            if(!isOperations(x)){
                stack.push(Integer.parseInt(x));
            }else{
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch(x){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num1/num2);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }

    private boolean isOperations(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return true;
        }
        return false;
    }
}
