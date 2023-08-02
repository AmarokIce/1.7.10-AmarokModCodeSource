import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class tt {
    public static final void main(String args[]) throws IOException {
        InputStream input = Files.newInputStream(new File("C:\\Users\\snowl\\Desktop\\en_US.lang").toPath());


    }
}
