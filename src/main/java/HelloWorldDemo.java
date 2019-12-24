import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class HelloWorldDemo {


    private String x;

    public void show(){

        System.out.println("hello world");

    }


}
