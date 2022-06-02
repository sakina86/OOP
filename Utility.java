package OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility {
//    Method:
//  * readFromCSV() - a static utility method that accepts a String parameter that represents a path to a csv file.
//     It reads the content of a given csv file and returns the content as List<String[]> where each String[] represents a row of information in a file.
//     Uses BufferedReader class to read from a file
//     and handles the checked exception with a try-catch block.

    public static List<String[]> readFromCSV(String fileName) throws IOException {

        List<String[]> list = new ArrayList<>();


        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;

        try {
            while ((line = br.readLine()) != null) {
                String[] eachLine = line.split(",");
                list.add(eachLine);
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
        return list;
    }
}