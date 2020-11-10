package org.progmatic;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> personContainer=Reader.read();
        sortArray(personContainer);
    }

    public static ArrayList<Person>sortArray(ArrayList<Person>lista){
        Collections.sort(lista);
        return lista;
    }

}
