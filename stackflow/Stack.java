package stackflow;
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full. Cannot push element " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop Element");
            return -1;
        }
        int poppedValue = stackArray[top--]; 
        System.out.println("Popped " + poppedValue + " from the Stack");
        return poppedValue;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}



