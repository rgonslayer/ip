package jarvis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import jarvis.task.TaskList;

public class StorageTest {
    private Storage s = new Storage("src/test/data/testTaskList.txt");

    @Test
    public void load_normalInput_loadCorrectly() throws IOException {
        assertEquals("[[T][ ] read book, [D][ ] return book (by: Sep 20 2022), [T][ ] gym]", s.load().toString());
    }

    @Test
    public void write_normalInput_writeCorrectly() throws IOException {
        Storage w = new Storage("src/test/data/testTaskList2.txt");
        w.write(new TaskList(s.load()));
        assertEquals("[[T][ ] read book, [D][ ] return book (by: Sep 20 2022), [T][ ] gym]", w.load().toString());
    }
}
