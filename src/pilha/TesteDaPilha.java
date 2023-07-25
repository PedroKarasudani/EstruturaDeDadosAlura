package pilha;

import java.util.Stack;

public class TesteDaPilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mauricio");
        System.out.println(stack);
        stack.push("Pedro");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
