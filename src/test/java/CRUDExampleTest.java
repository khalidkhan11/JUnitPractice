import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class CRUDExampleTest {
    ArrayList<Person> list;
    @BeforeEach
    public void setUp(){
        list = new ArrayList<>();

    }

    @Test
    public void createPerson(){

    }

    public static class ExecuteThis implements Executable {
        @Override
        public void execute() throws Throwable {
            System.out.println("This is executable");
        }
    }
}
