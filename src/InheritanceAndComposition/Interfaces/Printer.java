package InheritanceAndComposition.Interfaces;

/**
 * Created by holywar on 10/02/2017.
 */
public class Printer implements IMachine{
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;

    public Printer(boolean isOn, String modelNumber) {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
    }

    public void print(int copies){
        String onStatus;
        if(machine.isOn())
            onStatus = " is On!";
        else
            onStatus = " is Off!";

        String textToPrint = modelNumber + onStatus;
        while (copies > 0 && !paperTray.isEmpty()){
            System.out.println(textToPrint);
            copies--;
            paperTray.usePage();
        }

        if(paperTray.isEmpty())
            System.out.println("Load more paper!");
    }

    public void print(String text){
        System.out.println(text);
    }

    public String getModelNumber(){
        return modelNumber;
    }

    public void printColors(){
        String[] colors = new String[]{"Red", "Blue", "Green", "Yellow"};
        for (String currentColor : colors){
            if("Green".equals(currentColor))
                continue;
            System.out.println(currentColor);
        }
    }

    public void loadPaper(int count){
        paperTray.addPaper(count);
    }

    @Override
    public void TurnOn() {
        System.out.println("Warming up machine!");
        machine.TurnOn();
    }

    @Override
    public void TurnOff() {
        machine.TurnOff();
    }

    @Override
    public boolean isOn() {
        return machine.isOn();
    }
}
