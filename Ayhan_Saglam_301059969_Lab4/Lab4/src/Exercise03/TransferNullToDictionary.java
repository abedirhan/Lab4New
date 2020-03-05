package Exercise03;


import java.util.HashMap;

import java.util.Random;

public class TransferNullToDictionary {
    //This method select not null element of array and assign them in to new HasMap
    public static HashMap<Integer, Integer> trasferNotNull(int[] arr) {
        HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();// Create new Has Map
        for (int i = 0; i < arr.length; i++) { //Iterate lenght of array
            if (arr[i] == 0) { //if array[i] element is null then
                continue;//do nothing then continue
            } else {// if array[i] element is not null then
                dictionary.put(i, arr[i]);// put array index to hasmap key and put array[i] element to HasMap value.
            }
        }
        return dictionary;// return dictionary with selected not null element of array.
    }

    public static void main(String[] args) {
        Random rd = new Random();
        //Create an sparse array
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 0) {
                number[i] = rd.nextInt(100);
            }
        }
         //Print sparse array
        for (int i : number
        ) {
            System.out.print(i + ", ");

        }
        System.out.println("\n-------------------------------");
        System.out.println("After Listed in HasMap");
        HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        dictionary = trasferNotNull(number);

        System.out.println("\n-------------------------------");

        for (Integer name : dictionary.keySet()) {
            String key = name.toString();
            String value = dictionary.get(name).toString();
            System.out.println("Index: " + key + " " + "Value: " + value);
        }

    }
}
