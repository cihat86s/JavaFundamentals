package InheritanceAndComposition.Inheritance;

/**
 * Created by holywar on 10/02/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(true, "MY PRINTER");
        myPrinter.loadPaper(5);
        myPrinter.print(6);
        myPrinter.print(5);

        System.out.println("-----");
        Machine machine = new Printer(true, "MY PRINTER");
        machine.TurnOn();

        System.out.println("-----");
        Machine machine1 = new Machine(false);
        machine1.TurnOn();
    }
}

