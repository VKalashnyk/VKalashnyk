import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by v_kal on 15.10.2016.
 */
public class University {

    private ArrayList<Persone> entrants;

    public University(ArrayList<Persone> entrants){
        this.entrants=entrants;
        Zachislenie();
    }

    private void Zachislenie(){
        Scanner sc=new Scanner(System.in);
        Entrant ent;
        int i=0;
        for(Persone e: entrants){
            ent=(Entrant)e;
            if(ent.getAvrTests()>160){
                System.out.print("Введите факультет:\t");
                String facultet=sc.nextLine();
                entrants.set(i,new Student(ent.getName(),ent.getAge(),facultet));
            }
            i++;
        }
    }
}
