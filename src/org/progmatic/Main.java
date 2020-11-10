package org.progmatic;

//import java.io.Reader;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList <Person> personContainer=Reader.read();

    }

    public static ArrayList<Person>sortArray(ArrayList<Person>lista){
        Collections.sort(lista);
        return lista;
    }

}
