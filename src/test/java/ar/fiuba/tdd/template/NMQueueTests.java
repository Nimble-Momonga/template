package ar.fiuba.tdd.template;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by manuelcruz on 28/08/2016.
 */
public class NMQueueTests {

    NMQueueInterface<Integer> queue;

    @Before
    public void init() {
        queue = new NMQueue<Integer>();
    }

    @Test
    public void isEmptyShouldReturnTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmptyShouldReturnFalse() {
        queue.add(3);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void topShouldReturnFirstInput() throws NMQueueEmptyException {
        queue.add(5);
        queue.add(8);
        queue.add(3);
        queue.add(2);
        int top = queue.top();
        assertEquals(5, top);
    }

    @Test
    public void topShouldReturnSecondInput() throws NMQueueEmptyException {
        queue.add(5);
        queue.add(8);
        queue.add(3);
        queue.add(2);
        queue.remove();
        int top = queue.top();
        assertEquals(8, top);
    }

    @Test
    public void sizeShouldReturnSize() {
        queue.add(3);
        queue.add(7);
        queue.add(8);
        queue.add(12);
        queue.add(4);
        assertEquals(5, queue.size());
    }

}
