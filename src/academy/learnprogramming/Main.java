package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int array[] = getArray();

        printArray(array);

        int sortedArray[] = sortIntegers(array);

        printArray(sortedArray);
        printArray(array);
    }

    public static int[] getArray() {

        int num;

        System.out.print("Enter the number of integers to sort: ");

        while(true) {
            num = scanner.nextInt();

            if(num <= 0) {
                System.out.print("Enter a positive number: ");
                continue;
            }

            break;
        }


        int array[] = new int[num];
        System.out.println("Enter " + num + " integers: ");

        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array.length == 1) {
                System.out.println("{ " + array[i] + " }\n");
            } else {
                if(i == 0) {
                    System.out.print("{ " + array[i]);
                } else if(i == array.length - 1) {
                    System.out.print(", " + array[i] + " }\n");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        int temp;
        for(int i = 0; i < sortedArray.length; i++) {
            for(int j = 0; j < sortedArray.length - 1; j++) {
                if(sortedArray[j] < sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
