package Exercise02;

import java.util.Stack;

public class TransferStackElements {
    public static void transfer(Stack<Integer> S, Stack<Integer> T) {

        // loop until S is empty

        while (!S.isEmpty()) {//S size =6 and continue remove stack LIFO element and assign to temp variable, until all S stack element finish.

            // pop the top most element from S

            int temp = S.pop();// Each removed LIFO element of S stack assign to temp.


            // push temp into T

            T.push(temp); // insert temp to T stack with push method of Stack

        }
    }

    public static void main(String[] args) {

        // create two stacks

        Stack<Integer> S = new Stack<Integer>();

        Stack<Integer> T = new Stack<Integer>();

        T.push(8);//Bottom of T stack
        T.push(7);
        S.push(1);//Bottom of S Stack

        S.push(2);

        S.push(3);

        S.push(4);

        S.push(5);

        S.push(6);//Top of S stack




        transfer(S, T);// Stack S size = 6 T size =2


        System.out.println("S stack after transfer ");

        for (int i: T ) {
            System.out.println(i);

        }

    }
}
