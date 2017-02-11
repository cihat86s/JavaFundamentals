package InheritanceAndComposition.Interfaces;

public class HelloWorld {
    public static void main(String[] args) {
        IMachine machine = new InheritanceAndComposition.Interfaces.Printer(true, "MY PRINTER");
        machine.TurnOn();
    }
}

