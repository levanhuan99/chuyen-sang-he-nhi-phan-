import java.util.ArrayList;
import java.util.Stack;

public class DecimalBinary {
    public static void change(int num){
//        Stack<Integer> stack=new Stack<Integer>();
//        while (num!=0){
//            int result=num%2;
//            stack.push(result);
//            num=num/2;
//        }
//        while (!(stack.isEmpty())){
//            System.out.println(stack.pop());
//        }
//    }
        Stack<Integer> stack=new Stack<Integer>();
        while (num!=0){
            int result=num%2;
            stack.push(result);
            num=num/2;

        }
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int i=12;
        DecimalBinary.change(i);
    }


}
