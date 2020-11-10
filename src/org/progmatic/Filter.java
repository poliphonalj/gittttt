package org.progmatic;
import java.util.ArrayList;
import java.util.HashMap;

public class Filter {
//Írj egy Filter class-t, és annak írj egy cityFilter(String city, List<Person>) statikus metódust!



    public  static ArrayList<Person> cityFilter(String city, ArrayList<Person> people){
        ArrayList <Person>actualPeople=new ArrayList<>();
        for (Person actualPerson : people) {
            if(city.equals(actualPerson.getCity())) {
                actualPeople.add(actualPerson);
            }
        }
        return actualPeople;
    }
}
