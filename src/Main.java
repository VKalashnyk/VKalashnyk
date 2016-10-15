/**
 * Created by v_kal on 15.10.2016.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Persone> persones=new ArrayList<>();
        persones.add(new Entrant("Name1",17,170));
        persones.add(new Entrant("Name2",16,150));
        persones.add(new Entrant("Name3",18,190));
        persones.add(new Entrant("Name4",17,160));
        University u=new University(persones);
        for(Object p: persones)
            System.out.println(p.toString());

        //----------------------------------------
        ArrayList<Integer> numbers;
        numbers=Method(10);
        for(Integer n: numbers){
            System.out.print("\t"+n);
        }
    }

    static ArrayList<Integer> Method(int a){
        ArrayList<Integer> l=new ArrayList<>();
        int curr=1;
        int prev=1;

        l.add(prev);
        l.add(curr);

        int sum=0;
        while(true) {
            sum = curr + prev;
            prev = curr;
            curr = sum;
            if(curr>a) break;
            l.add(curr);
        }
        return l;
    }
}