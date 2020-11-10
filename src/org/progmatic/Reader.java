package org.progmatic;

import com.sun.glass.ui.Clipboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private static List<Person> people = new ArrayList<>();

    public Reader() {
    }


    public static void read() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("files/us-500.csv"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            people.add(new Person(line[0], line[1], line[4], line[10]));
        }
    }
}
