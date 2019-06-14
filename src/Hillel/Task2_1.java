package Hillel;
/* Create an array of double and fillArray( ) it using RandDoubleGenerator. Print the results.*/

import java.util.Random;


public class Task2_1 {
    private static double[] dArr;

    public static double[] fillArray(){
        dArr = new double[10];
        for (int i = 0; i< dArr.length; i++) {
            dArr[i] = randDoubleGenetration();


        }

        return dArr;
    }

    public static double randDoubleGenetration(){
        Random rand = new Random();
        double randDoub=rand.nextDouble();
  return randDoub;

    }


    public static void print(){
        for(double n: dArr){
            System.out.println(n+" ");
        }
    }


    public static void main(String args[]) {
        fillArray();
        print();

    }




 //       Arrays.fillArray(dArr,dArr[i]);

    }

