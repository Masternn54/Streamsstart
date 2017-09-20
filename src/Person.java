import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Bog: Avanceret Java
 * Kapitel # - Streams - Person.java
 * Eksempel - En Serializable klasse, med readObject metode og serialVersionUID
 * @author Sonny Sandberg
 */
public class Person implements Serializable
{
    private static final long serialVersionUID = 42L;
    private String  firstName,
            lastName;
    private transient long timeOfCreationInSystem;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        setTimeOfCreationInSystem();
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public long getTimeOfCreationInSystem()
    {
        return timeOfCreationInSystem;
    }

    private void setTimeOfCreationInSystem()
    {
        Date d = new Date();
        timeOfCreationInSystem = d.getTime();
    }
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
        setTimeOfCreationInSystem();
    }

    @Override
    public String toString()
    {
        return String.format("Fornavn: %s\nEfternavn: %s\nTime of creation: %d", getFirstName(), getLastName(), getTimeOfCreationInSystem());
    }
}

