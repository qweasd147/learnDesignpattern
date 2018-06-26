package pattern.state;


public class StateMain {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.ejectQuarter();
    }
}
