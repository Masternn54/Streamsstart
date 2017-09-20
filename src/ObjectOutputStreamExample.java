import java.io.*;

/**
 * Bog: Avanceret Java
 * Kapitel # - Streams - ObjectOutputStreamExample.java
 * Eksempel - Brug af ObjectOutputStream og Serialization til at gemme objekter i filer
 * @author Sonny Sandberg
 */
public class ObjectOutputStreamExample
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        /*
        Først opretter vi et Person objekt.
        Person klassen implementerer Serializable, hvilket er et krav bruge
        objektet korrekt i en ObjectOutputStream
        */
        Person p = new Person("Sonny", "Sandberg");

        /*
        Vi udskriver filen i systemet for at se, at den er korrekt
        Noget lignende dette vil blive vist:
        Fornavn: Sonny
        Efternavn: Sandberg
        Time of creation: 1408040614077
        */
        System.out.println(p);

        // Opret en fil, som objektet skal skrives til.
        FileOutputStream fos = new FileOutputStream("person.txt");
        // Opret ObjectOutputStreamen, som skal skrive objektet til filen
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Her skriver vi objektet til filen
        oos.writeObject(p);
        // Der lukkes og slukkes efter os
        oos.close();
    }
}

