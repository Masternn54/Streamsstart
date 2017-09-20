import java.io.IOException;

public class writeObjecteksempel {

    private void writeObject(java.io.ObjectOutputStream out) throws IOException, ClassNotFoundException
    {
        out.defaultWriteObject();
        // Noget kode som gør et eller andet. For eksempel kalder andre metode eller skriver en logfil
    }

}
