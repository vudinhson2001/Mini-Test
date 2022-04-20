package hogiadinh;

import java.util.ArrayList;

public class Family  implements Comparable<Family>{
    private ArrayList<Person> familyList;
    private String address;
    private int numberPeople;

    public Family() {
        this.familyList =new ArrayList<>();
    }

    public Family( String address, int numberPeople1) {
        this.familyList =new ArrayList<>();
        this.address = address;
        this.numberPeople = numberPeople1;
    }

    public Family(String nhapId, int nhapTuoi, String nhapTen, String nhapjob) {
    }

    public ArrayList<Person> getGiaDinh() {
        return familyList;
    }

    public void setGiaDinh(ArrayList<Person> giaDinh) {
        this.familyList = giaDinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }
    public int add(Person nguoi){
        this.familyList.add(nguoi);
        numberPeople++;
        return numberPeople;
    }
    public void remove( String name){
        for (int i = 0; i < familyList.size(); i++)
            if(familyList.get(i).getName().equals(name)){
                familyList.remove(familyList.get(i));
                break;
            }

    }
    public int search(String name){
        for(int i = 0; i< familyList.size(); i++){
            if(familyList.get(i).getName().equals(name)){
                return i ;
            }
        }
        return -1;
    }
    public void edit(String name, Person person){
        familyList.set(search(name), person);
    }
    public void display(){
        for(int i = 0; i< familyList.size(); i++){
            System.out.println(this.familyList.get(i).toString());
        }
        System.out.println("Dia Chi "+ address +", So Thanh Vien "+ getNumberPeople());
    }
    public Person findMaxAge(){
        int max= familyList.get(0).getAge();
        for(int i = 0; i< familyList.size(); i++){
            if(familyList.get(i).getAge()>max){
                max= familyList.get(i).getAge();

            }
        }
        return familyList.get(search(max));
    }
    public Person findMinAge(){
        int min= familyList.get(0).getAge();
        for (int i = 0; i < familyList.size() ; i++) {
            if(familyList.get(i).getAge()<min){
                min= familyList.get(i).getAge();
            }
        }
        return familyList.get(search(min));
    }
    public int search(int age){
        for(int i = 0; i< familyList.size(); i++){
            if(familyList.get(i).getAge()==age){
                return i ;
            }
        }
        return -1;
    }
    @Override
    public int compareTo(Family o) {
        return this.getNumberPeople()-o.getNumberPeople();
    }
}
