import org.example.File;
import org.example.Folder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileTest {

    @Test
    void testSetTypeCannotBeEmptyOrNull() {
        File file = new File("document", "pdf", 100);
        assertNotNull(file.getType(), "File type should not be null");
        assertFalse(file.getType().isEmpty(), "File type should not be empty");
    }
}

