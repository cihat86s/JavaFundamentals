package InheritanceAndComposition.Interfaces;

/**
 * Created by holywar on 10/02/2017.
 */
public class Machine implements IMachine {
    protected boolean isOn; // protected sadece kendi class ve alt class lar erisebilir

    public Machine(boolean isOn) {
        this.isOn = isOn;
    }

    public void TurnOn(){
        isOn = true;
        System.out.println("Machine is on!");
    }

    public void TurnOff(){
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
