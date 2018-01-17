package nyc.c4q;

import java.util.*;

public class Problems {

    public static void main(String[] args) {

        int[] numbers= new int[]{1, 2, 3, 4, 5, 1, 2, 3};
        //System.out.println(selectEvenNumbers(numbers));

        System.out.println(removeDupes(numbers));

        for (int num:removeDupes(numbers)) {
            System.out.println(num);
        }

        countTheLetters("elephant");

    }


    /**
     * Create a function `selectEvenNumbers` that will take in an array of numbers and return an array of only even numbers.
     * If there are no even numbers, return the empty array.
     */
    public static int[] selectEvenNumbers(int[] numbers) {
        List<Integer> evenList= new ArrayList<>();
        if(numbers==null){
            int [] list= new int[]{};
            return list;
        }
        for (int num:numbers) {
            if (num%2==0&&num>=0){

                evenList.add(num);
            }
        }
        int [] list= new int[evenList.size()];

        for (int i = 0; i < evenList.size(); i++) {
            list[i]=evenList.get(i);
        }

        return list;
    }





    /**
     Given an array of integers, write a method called int[] removeDupes(int[] input) that returns a new array of just the unique values.

     You may use additional data structures in your solution.

     ```
     removeDupes(new int[]{1, 2, 3, 4, 5, 1, 2, 3});

     // returns {4, 5}

     removeDupes(new int[]{7, 7, 7, 7, 7}}

     // returns {}
     ```
     */
    public static int[] removeDupes(int[] numbers) {
        Set<Integer> newSet = new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        for (int num : numbers){
            newSet.add(num);
        }
        int[] arr= new int[newSet.size()];
        int counter=0;

        for (Integer num: newSet) {
            arr[counter]=num;
            counter++;
        }
        return arr;


        //Map of Number to count
        //for each element
            //add it if doesnt exits or increase count if exist
        //return keys that jave count of 0
    }


    /**
    Alternative form of removeDupes is getDistinct() that returns the distinct elements in the array.
     */



    /**
     Given a string, write a method called countTheLetters takes a string input and returns a map containing a count for each of the letters in the string.

     ```
     countTheLetters("dog");
     // returns a map containing the pairs {d: 1, o: 1, g: 1}

     countTheLetters("elephant");
     // returns a map containing the pairs {e: 2, l: 1, p: 1, h: 1, a: 1, n: 1, t: 1}

     countTheLetters("llama");
     // returns a map containing the pairs {l: 2, a: 2, m: 1}
     ```
     */
    public static HashMap<String, Integer> countTheLetters(String input) {

        HashMap<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            String letter = Character.toString(input.charAt(i));
            Integer value = countMap.get(letter);

            if (value == null) {
                countMap.put(Character.toString(input.charAt(i)), 1);
                //Log.d("countTheLetters: ", countMap.toString());
            } else {
                int timesSeen = value;
                countMap.put(Character.toString(input.charAt(i)), value += 1);
                //Log.d("countTheLetters: ", countMap.toString());
            }
        }
        return countMap;
    }
}
