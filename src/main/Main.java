package main;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    /** Exercise 1 */

    public static double exercise1 (  ){

        double[] average = new double[TestDataI.MATRIX.length];

        for( int column = 0; column <  TestDataI.MATRIX.length; column++ ) {
            double averageColumn = 0;
            for( int row = 0; row <  TestDataI.MATRIX.length; row++ ) {
                averageColumn += Double.parseDouble(TestDataI.MATRIX[column][row]);
            }
            averageColumn = averageColumn / (TestDataI.MATRIX.length);
            average[column] = averageColumn;
        }
        Arrays.sort(average);

        return average[average.length - 1];


    }

    /** Exercise 2 */

    public static ArrayList exercise2 (int n){
        long startTime = System.nanoTime();
        int [] array = new int[(n+1)];
        ArrayList<Integer> returnValue = new ArrayList<Integer>();
        /** Add element to Array */
        int i = 0;
        while (i < (n+1)){
            int randomNumb = new Random().nextInt(n)+1;
            array[i] = randomNumb;
            i++;
        }
        /** Check the duplicates */
        Arrays.sort(array);
        if(array.length > 1) {
            for (int index = 1; index < array.length; index++) {

                if ( ( array[index] == array[index - 1] ) && ( ( returnValue.isEmpty() )
                        || (returnValue.get(returnValue.size() - 1) != array[index]) ) ) {
                        returnValue.add(array[index]);
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        double seconds = (double)(totalTime) / 1_000_000_000.0;
        System.out.println(seconds);
        return returnValue;
    }

    public static void main(String[] args) {

        /** Exercise 4 */

        Singleton singleton = Singleton.aObject();
        Singleton singleton1 = Singleton.aObject();
        Singleton singleton2 = Singleton.aObject();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);


        System.out.println(exercise2(5));

        //System.out.println(exercise2(100000));

        System.out.println(exercise1());

    }
}
