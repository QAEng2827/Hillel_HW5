package Hillel.task2_2;
/*Create a new class called Mouse with an int mouseNumber that’s initialized in the constructor.
Give it a method called hop( ) that prints out which mouse number this is, and that it’s hopping.
 Create an ArrayList and add a bunch of Mouse objects to the List. Now use the get( ) method to move
 through the List and call hop( ) for each Mouse.*/

import java.util.ArrayList;

public class Task2_2 {
    public static void main(String[] args){
        ArrayList<Mouse> mouseList = new ArrayList<Mouse>();
        for (int i=0; i<8; i++){
            mouseList.add(new Mouse(i+1));
        }
        for (int i=0; i<8; i++){
            (mouseList.get(i)).hop();
        }


    }
}
