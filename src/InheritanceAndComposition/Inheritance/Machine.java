package InheritanceAndComposition.Inheritance;

/**
 * Created by holywar on 10/02/2017.
 */
public class Machine {
    boolean isOn; // protected sadece kendi class ve alt class lar erisebilir

    Machine(boolean isOn) {
        this.isOn = isOn;
    }

    public void TurnOn(){
        isOn = true;
        System.out.println("Machine is on!");
    }

    public void TurnOff(){
        isOn = false;
    }
}
