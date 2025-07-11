package Collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStacks {
    public static void main(String[] args) throws EmptyStackException {
        try{
            Stack<Integer>myStack = new Stack<>();
            myStack.push(12);
            myStack.push(24);
            myStack.push(36);
            myStack.push(42);
            myStack.push(53);
            myStack.push(142);
            int removeElement = myStack.pop();
//            myStack.pop();
//            myStack.pop();
//            myStack.pop();myStack.pop();
//            myStack.pop();
//            myStack.pop();
            //LIFO--> last in first out
            myStack.peek();// if it is an empty stack, it throws empty stack exception

            for(Integer ms:myStack){
                System.out.println(ms);

            }
            System.out.println("The popped element is "+ removeElement);
            System.out.println("The number 53 is at element "+ myStack.search(53));
            System.out.println("The number 12 is at element "+ myStack.search(12));
            System.out.println("Getting "+myStack.get(0));

        }catch(Exception e){
            System.out.println("The exception is thrown here is "+e.getMessage());
        }

    }
}
