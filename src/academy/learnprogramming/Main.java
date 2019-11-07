package academy.learnprogramming;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int array[] = getArray();

        printArray(array);

        int sortedArray[] = sortIntegers(array);

        printArray(sortedArray);
    }

    public static int[] getArray() {

        int num;
        Scanner scanner = new Scanner(System.in);

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
        int temp;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
