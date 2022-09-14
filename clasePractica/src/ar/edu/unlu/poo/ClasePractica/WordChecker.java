package ar.edu.unlu.poo.ClasePractica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordChecker {
	
    public static boolean check_for_word(String word) {
        // System.out.println(word);
        try {
            BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/spanish"));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.indexOf(word) != -1) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
        }
        return false;
    }
}
