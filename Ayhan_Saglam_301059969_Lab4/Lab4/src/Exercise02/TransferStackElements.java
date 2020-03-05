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

        Stack<Integer> S = new Stack<>();

        Stack<Integer> T = new Stack<>();

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

        for (int i : T) {
            System.out.println(i);

        }
        //Extre question solve
        /*C-6.20 Suppose you have three non empty stacks R, S, and T. Describe a sequence of operations that results in S storing all elements originally in T below all of S’s original elements, with both sets of those elements in their original order.
        The Final configuration for R should be the same as its original configuration. For example, if R = (1,2,3), S = (4,5), and T = (6,7,8,9), when ordered from bottom to top, then the Final configuration should have R = (1,2,3) and S = (6,7,8,9,4,5).*/

        Stack<Integer> R2 = new Stack<>();
        R2.push(1);//FILO
        R2.push(2);
        R2.push(3);

        Stack<Integer> S2 = new Stack<>();
        S2.push(4);
        S2.push(5);

        Stack<Integer> T2 = new Stack<>();
        T2.push(9);//FiLO
        T2.push(8);
        T2.push(7);
        T2.push(6);
        //Before replace
        System.out.println("Transferring T stack elements to S Stack");

        while (true) {
            if (T2.isEmpty()) break;

            // pop the top most element from S

            int temp = T2.pop();// Each removed LIFO element of S stack assign to temp.


            // push temp into T

            R2.push(temp); // insert temp to T stack with push method of Stack

        }
        for (var i = 0; i <4 ; i++) {
            int temp = R2.pop();
            S2.push(temp);
        }

        for (int i:S2 ) {
            System.out.print(i+",");
        }
    }
}
