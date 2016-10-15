/**
 * Created by v_kal on 15.10.2016.
 */
public class Student extends Entrant{
    private String facultet;
    public Student(String name,int age,String facultet){
        super(name,age);
        this.facultet=facultet;
    }
    public String getFacultet(){
        return facultet;
    }
    @Override
    public  String toString(){
        return name+"\t"+age+"\t"+facultet;
    }
}
