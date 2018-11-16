package Easy;

import java.util.Arrays;
import java.util.Stack;

/**
https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x){
        int solution = 0;
        String integerInput = Integer.toString(x);
        char stringInput[] = integerInput.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i =0; i<stringInput.length;i++){
            if (stringInput[stringInput.length] == 0){

            }else {
            stack.push(stringInput[i]);
            }
        }
        char stringOutput[] = new char[stringInput.length];
        for (int i =0; i<stack.capacity();i++){
            if (stack.peek().equals('-')){
                stack.pop();
            }
            else {
                stringOutput[i]=stack.pop();
            }
        }
        String string = new String(stringOutput);
        System.out.println(string);
        solution = Integer.parseInt(string);
        System.out.println(solution);
        return solution;
    }
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-120));
    }
}

