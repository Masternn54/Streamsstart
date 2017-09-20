import java.io.*;

/**
 * Bog: Avanceret Java
 * Kapitel # - Streams - PrintWriterExample.java
 * Eksempel - Brug af PrintWriter til at skrive til en fil
 * @author Sonny Sandberg
 */
public class PrintWriterExample
{
    /**
     * For at afkorte eksemplet, kastes exceptions
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        /**
         * Opret et PrintWriter objekt, med henvisning til et FileWriter objekt.
         * Nedenstående vil overskrive en eksisterende fil og autoflushe streamen
         * PrintWriter pw = new PrintWriter(new FileWriter("example.txt", true), true);
         * Ovenstående eksempel ville instruere objektet i at tilføje til en eksisterende fil,
         * hvis den eksisterer og sætte autoflush til true.
         *
         * FileWriter fw = new FileWriter("example.txt");
         * PrintWriter pw = new PrintWriter(fw, true);
         * Ovenstående vil gøre præcis det samme, som nedenstående eksempel
         */
        PrintWriter pw = new PrintWriter(new FileWriter("example.txt"), true);

        for (int i = 0; i < 100; i++)
        {
            // Skriv en ny linie til filen
            pw.println(String.format("Dette er en fil (linie %d)", i+1));
        }

        pw.close();
    }
}
