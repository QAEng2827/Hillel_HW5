package Hillel;
/*Create a List (try both ArrayList and LinkedList) and fill it with 5 countries.
Sort the list and print it,
 then apply Collections.shuffle( ) to the list repeatedly, printing it each time
 so that you can see how  the shuffle( ) method randomizes the list differently each time.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2_4 {

    public static void main(String[] args) {
       List<String> countryList= new ArrayList<>();
        countryList.add("USA");
        countryList.add("GB");
        countryList.add("Germany");
        countryList.add("France");
        countryList.add("Ukraine");
        System.out.println("The arrayList is : "+ countryList);

        Collections.sort(countryList);
        System.out.println("Sorted ArrayList: "+countryList);

        Collections.shuffle(countryList);
        System.out.println("First shuffle: "+countryList);
        Collections.shuffle(countryList);
        System.out.println("Second shuffle: "+countryList);

      System.out.println("_________________________________");
//
        List<String> countryListLink= new LinkedList<>();
        countryListLink.add("Germany");
        countryListLink.add("France");
        countryListLink.add("USA");
        countryListLink.add("Ukraine");
        countryListLink.add("GB");


        System.out.println("The linkList is : "+ countryListLink);

        Collections.sort(countryListLink);
        System.out.println("Sorted LinkList: "+countryListLink);

        Collections.shuffle(countryListLink);
        System.out.println("First shuffle: "+countryListLink);

        Collections.shuffle(countryListLink);
        System.out.println("Second shuffle: "+countryListLink);


    }
}

