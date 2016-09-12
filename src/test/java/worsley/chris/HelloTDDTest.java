package worsley.chris;


import org.junit.Assert;
import org.junit.Test;
import worsley.chris.HelloTDD.HelloTDD;

public class HelloTDDTest {

    @Test
    public void displayMessageTest() {
        HelloTDD helloTDD = new HelloTDD();
        Assert.assertEquals("The message returned is equal to cat","cat",helloTDD.displayMessage());
    }
}
