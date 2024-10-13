import org.example.File;
import org.example.Folder;
import org.example.SystemElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FolderTest {

    List<SystemElement> subFolderElements = new ArrayList<>();

    @Test
    @DisplayName("An empty folder has a size of zero")

    //Este no deberia fallar?
    public void testEmptyFolderIsZero() {
        Folder folder = new Folder("Documents", subFolderElements);
        assertEquals(0, folder.getSize());
    }

    @Test
    @DisplayName("When a file is added to a folder, the folder's size increases by the file's size")
    public void whenAddingAFileToTheFolderItsSizeIncreasesByTheFileSize() {
        List<SystemElement> systemElements = new ArrayList<>();
        Folder folder = new Folder("Documents", systemElements);
        File file = new File("File1", "txt", 100);
        folder.saveFile(file);
        assertEquals(100, folder.getSize());
    }
}