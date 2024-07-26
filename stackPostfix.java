import java.util.Scanner;
class LinkStack {
    Node top = null;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    void push(int n) {
        Node newnode = new Node(n);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }
}

public class stackPostfix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkStack stack = new LinkStack();
        String k = sc.next();
        sc.close();
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push(ch - 48);
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}