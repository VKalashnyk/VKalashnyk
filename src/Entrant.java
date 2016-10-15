import java.util.Map;

/**
 * Created by v_kal on 15.10.2016.
 */
public class Entrant extends Persone{
    //private Map<String,Double> Marks;
    private double avrTests;
    public Entrant(String name, int age){
        super(name,age);
    }
    public Entrant(String name, int age,double avrTests){
        super(name,age);
        this.avrTests=avrTests;
    }
    public double getAvrTests(){
        return avrTests;
    }
    @Override
    public String toString(){
        return super.toString()+avrTests;
    }
}
