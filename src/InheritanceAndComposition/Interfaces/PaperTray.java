package InheritanceAndComposition.Interfaces;

/**
 * Created by holywar on 10/02/2017.
 */
public class PaperTray {
    int pages = 0;

    public void addPaper(int count){
        pages += count;
    }

    public void usePage(){
        pages--;
    }

    public boolean isEmpty(){
        return !(pages > 0) ;
    }
}
