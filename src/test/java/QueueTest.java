package test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public  void IsQueueEmpty(){
        //Arrange
        Boolean expected = Boolean.TRUE;
        Queue queue = new Queue();

        //Act
        Boolean actual = queue.say(Boolean.TRUE);

        //Assert
        assertEquals(expected,actual);
    }
}
