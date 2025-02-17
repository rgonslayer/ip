package jarvis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jarvis.task.Deadline;

public class DeadlineTest {
    private Deadline test = new Deadline("return book", "2022-09-08");

    @Test
    public void toString_normalInput_displayCorrectly() {
        assertEquals("[D][ ] return book (by: Sep 8 2022)", test.toString());
    }

    @Test
    public void mark_normalInput_markedCorrectly() {
        test.mark();
        assertEquals("[D][X] return book (by: Sep 8 2022)", test.toString());
    }

    @Test
    public void unmark_normalInput_unmarkedCorrectly() {
        test.unmark();
        assertEquals("[D][ ] return book (by: Sep 8 2022)", test.toString());
    }
}
