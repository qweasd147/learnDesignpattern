package pattern.command.base;

public class BaseMain {
    
    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver();
        Command concreteCommand = new ConcreteCommand(receiver);

        invoker.setCommand(concreteCommand);
        invoker.invoke();
    }
}
