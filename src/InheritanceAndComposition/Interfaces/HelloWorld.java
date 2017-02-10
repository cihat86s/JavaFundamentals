package InheritanceAndComposition.Interfaces;

import InheritanceAndComposition.Inheritance.Machine;
import InheritanceAndComposition.Inheritance.Printer;

/**
 * Created by holywar on 10/02/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        IMachine machine = new InheritanceAndComposition.Interfaces.Printer(true, "MY PRINTER");
        machine.TurnOn();
    }
}

