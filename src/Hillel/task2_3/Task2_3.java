package Hillel.task2_3;
/* Modify Exercise 2 so you use an Iterator to move through the List while calling hop( ).
Take the Mouse class in Exercise 2 and put it into a Map instead, associating the name of the Mouse
as a String (the key) for each Mouse (the value) you put in the table.
Get an Iterator for the keySet( ) and use it
 to move through the Map, looking up the Mouse for each key and printing out the key and telling the mouse to hop( ).
*/

public class Task2_3 {
    public static void main(String[] args) {
       MouseMap mouseMap = new MouseMap();
       mouseMap.mapMouse();
       mouseMap.tellMouseHop();


    }
}
