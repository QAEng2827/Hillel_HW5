package Hillel.task2_3;

import Hillel.task2_2.Mouse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MouseMap {
//    HashMap<Integer,String> hash_map= new HashMap<Integer, String>();
//

   HashMap <String, Mouse> hash_map=new HashMap<String, Mouse>();

     public void mapMouse(){
         hash_map.put("First", new Mouse(1));
         hash_map.put("Second", new Mouse(2));
         hash_map.put("Third",  new Mouse(3));
         hash_map.put("Fourth", new Mouse(4));
         hash_map.put("Fifth", new Mouse(5));

         }

     public void tellMouseHop(){
         Set mouseKeySet = hash_map.keySet();
         Iterator<String> mouseIt = mouseKeySet.iterator();
         while (mouseIt.hasNext()){
           //  System.out.printf("%s",mouseKeySet.);
             hash_map.get(mouseIt.next()).hop();

         }
     }
}
