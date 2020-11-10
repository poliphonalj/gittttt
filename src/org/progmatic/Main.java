package org.progmatic;

//import java.io.Reader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Reader people = new Reader();

    }

    public static ArrayList<Person> sortArray(ArrayList<Person>lista){
        Collections.sort(lista);
        return lista;
    }

}
