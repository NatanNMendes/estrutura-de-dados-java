package dataStructure.stack;

public class StackApp {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.print();
//        myStack.print();
//        myStack.getTop();
    }
}
