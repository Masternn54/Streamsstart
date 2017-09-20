import java.io.IOException;

public class readObjecteksempel {

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
    }

}
