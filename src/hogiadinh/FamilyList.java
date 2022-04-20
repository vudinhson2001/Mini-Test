package hogiadinh;

import java.util.ArrayList;

public class FamilyList {
    private ArrayList<Person> list;

    public FamilyList(ArrayList<Person> list) {
        this.list = list;
    }

    public FamilyList() {
        this.list=new ArrayList<Person>();
    }
    // them thanh vien
    public void AddFamily(Person person){
        this.list.add(person);
    }
    // in thanh vien ra man hinh
    public void printPerson(){

        for (Person person: list) {
            System.out.println( person);
        }
    }
}
