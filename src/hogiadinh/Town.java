package hogiadinh;

import java.util.ArrayList;

public class Town {
    ArrayList<Family> TownList = new ArrayList<>();

    public Town(ArrayList<Family> townList) {
        TownList = townList;
    }

    public Town() {
    }

    public void add(Family family) {
        TownList.add(family);
    }
    public void remove( String name){
        for (int i = 0; i < TownList.size();i++)
            if(TownList.get(i).getAddress().equals(name)){
                TownList.remove(TownList.get(i));
                break;
            }

    }

    public void display() {
        for (int i = 0; i < TownList.size(); i++) {
            System.out.println(this.TownList.get(i).toString()+"\n");
        }
        System.out.println("----------------");
    }
    public void MaxNumber(){
        int max = TownList.get(0).getNumberPeople();
        for(int i=0;i<TownList.size();i++){
            if(TownList.get(i).getNumberPeople()>max){
                max=TownList.get(i).getNumberPeople();
            }
        }
        System.out.println(max);
    }
}

