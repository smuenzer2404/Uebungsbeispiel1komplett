package org.campus02.arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 6, 7, 7, 7, 7};
        int[] numbers2 = {1, 2, 3, 2, 1, 4, 5, 4, 3};

        System.out.println(isSortedArray(numbers));
        System.out.println(isSortedArray(numbers2));

        //System.out.println(Arrays.toString(removeDuplicates(numbers2)));
        //System.out.println(Arrays.toString(removeDuplicates(numbers)));
        System.out.println(Arrays.toString(reverseArray(numbers2)));

    }

    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;

    }


    public static int[] removeDuplicates(int[] numbers) {
        // int[] numbers2 = {1, 2, 3, 2, 1, 4, 5, 4, 3};
        for (int i = 0; i < numbers.length; i++) { //hier stehe ich bei 1
            if (numbers[i] > 0) {
                for (int j = i + 1; j < numbers.length; j++) { //hiermit fahre ich von 2 bis zum Ende
                    if (numbers[j] == numbers[i]) { // wenn j (Zahl die ich gerade durchitteriere 2,3,2,1,...) meinem i von der ersten Schleife entspricht
                        numbers[j] = -1;            // dann setze ich j -1
                    }
                }

            }

        }
        return numbers;
    }


    public static int[] reverseArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        /*for (int i = 0, j = numbers.length - 1; j >= 0; i++, j--) {
            int temp = numbers[j]; // hier speichere ich den letzten Wert von numbers in die Variable temp
            reversedArray[i] = temp; //hier schreibe ich den letzten Wert (temp) von numbers in den ersten Wert vom neuen Array (reversedArray)
*/
        int l = 0; //Zählvariable für mein reversedArray
        for (int k = numbers.length - 1; k >= 0; k--) { //hier mache ich eine for Schleife bei der ich von hinten nach vorne durchlaufe
            reversedArray[l] = numbers[k]; //ich speichere den letzen wert von numbers an der Stelle k in den ersten Wert von meinem reversed array (das ist l)
            l++; // hier erhöhe ich l
        }
        return reversedArray;
    }


}

