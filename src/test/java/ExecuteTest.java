import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ExecuteTest {

    public void executeMachine(String s, Executable e) throws Throwable {
            e.execute();
    }

}
