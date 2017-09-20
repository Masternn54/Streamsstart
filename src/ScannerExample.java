

import java.io.*;
import java.util.Scanner;

/**
 * Bog: Avanceret Java
 * Kapitel # - Streams - ScannerExample.java
 * Eksempel - Brug af Scanner til at læse fra fil
 * @author Sonny Sandberg
 */
public class ScannerExample
{
    /**
     * Dette eksempel forudsætter en fil med navnet "Tekst Eksempel.txt",
     * hvor i der indgår noget tekst der kan læses.
     * For at afkorte eksemplet, kastes exceptions
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // Åbn fil og hent al tekst fra filen ind i vores Scanner
        Scanner in = new Scanner(new FileReader("Tekst Eksempel.txt"));

        // Så længe der er linier, fortsæt
        while (in.hasNext())
        {
            // Udskriv linien
            System.out.println(in.nextLine());
        }

        in.close();
    }
}
