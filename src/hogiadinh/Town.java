package hogiadinh;

import java.util.ArrayList;
import java.util.Collections;

public class Town {
    ArrayList<Family> townList = new ArrayList<>();

    public Town(ArrayList<Family> townList) {
        this.townList = townList;
    }

    public Town() {
    }

    public void add(Family family) {
        townList.add(family);
    }
    public void remove( String name){
        for (int i = 0; i < townList.size(); i++)
            if(townList.get(i).getAddress().equals(name)){
                townList.remove(townList.get(i));
                break;
            }

    }

    public void display() {
        for (int i = 0; i < townList.size(); i++) {
            System.out.println(this.townList.get(i).toString()+"\n");
        }
        System.out.println("----------------");
    }
    public void findMaxNumber(){
        int max = townList.get(0).getNumberPeople();
        for(int i = 0; i< townList.size(); i++){
            if(townList.get(i).getNumberPeople()>max){
                max= townList.get(i).getNumberPeople();
            }
        }
        System.out.println(max);
    }
    public void sortByMembers(){
        Collections.sort(townList);
    }

}

