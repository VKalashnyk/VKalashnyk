/**
 * Created by v_kal on 15.10.2016.
 */
public abstract class Persone {
    protected String name;
    protected int age;

    public Persone(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name+"\t"+age+"\t";
    }
}
