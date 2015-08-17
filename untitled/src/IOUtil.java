import java.io.File;
import java.io.IOException;

public class IOUtil {
    public static File createTestDir() throws IOException {
        return File.createTempFile("d", "asd");
    }
}
