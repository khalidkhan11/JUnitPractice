public class ExecuteTest {

    public void useExecuteMachine() throws Throwable {
        ExecuteIt exm = new ExecuteIt();
        exm.executeMachine("testing", () ->{
            System.out.println("hi");
            for(int i =0;i<10;i++){
                System.out.println("Hello there "+i);
            }
        });
    }
}
