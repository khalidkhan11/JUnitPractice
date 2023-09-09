import org.junit.jupiter.api.function.Executable;

public class ExecuteIt {

    public void executeMachine(String s, Executable e) throws Throwable {
        try {
            e.execute();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
