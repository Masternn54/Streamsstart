

import java.io.*;

/**
 * Bog: Avanceret Java
 * Kapitel # - Streams - BufferedReaderExample.java
 * Eksempel - Brug af BufferedReader til at læse fra fil
 * @author Sonny Sandberg
 */
public class BufferedReaderExample
{
    /**
     * Dette eksempel forudsætter en fil med navnet "Tekst Eksempel.txt",
     * hvor i der indgår noget tekst der kan læses.
     * For at afkorte eksemplet, kastes exceptions
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // Åbn fil og hent al tekst fra filen ind i vores BufferedReader
        BufferedReader in = new BufferedReader(new FileReader("Tekst Eksempel.txt"));

        // Hent første linie
        String line = in.readLine();

        // Så længe line ikke er null, fortsæt
        while (line != null)
        {
            // Udskriv line
            System.out.println(line);
            // Hent næste linie
            line = in.readLine();
        }

        if (in != null)
        {
            in.close();
        }
    }
}
