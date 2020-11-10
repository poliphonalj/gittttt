package org.progmatic;

//import java.io.Reader;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Person>people=new ArrayList<>();
    public static void main(String[] args)throws Exception {

       people= Reader.read();
        sortArray(people);
    }

    public static ArrayList<Person> sortArray(ArrayList<Person>lista){
        Collections.sort(lista, new SortByName());
        return lista;
    }

}
