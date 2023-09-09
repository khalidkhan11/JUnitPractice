import org.junit.jupiter.api.function.Executable;
public class ExecuteThis implements Executable {
    @Override
    public void execute() throws Throwable {
        System.out.println("This is executable");
    }
}
