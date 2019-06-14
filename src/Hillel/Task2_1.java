package Hillel;
/* Create an array of double and fill( ) it using RandDoubleGenerator. Print the results.*/

import java.util.Random;

//import  com.bruceeckel.util.*;
public class Task2_1 {

//    public void double randDoubleGenetration(){
//
//    }
    public static void main(String args[]){

//        public static void main(String args[]) {
//            double[] da = new double[10];
//
//            Arrays2.fill(da, new Arrays2.RandDoubleGenerator());
//            System.out.println(Arrays2.toString(da));
//        }


        Random rand = new Random();

    double[] dArr = new double[10];

    for (int i = 0; i< dArr.length; i++) {
        dArr[i] = rand.nextDouble();
        System.out.println(dArr[i]);

 //       Arrays.fill(dArr,dArr[i]);

    }
  //      System.out.println(Arrays.toString(dArr));
}

}
