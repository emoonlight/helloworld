import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldDemoTest {

    @Test
    public void show() {
        HelloWorldDemo demo = new HelloWorldDemo();

        demo.show();

        if(true){

            System.out.println();
            demo.getX();

        }


    }
}