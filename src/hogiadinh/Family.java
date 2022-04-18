package hogiadinh;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person>giaDinh;
    private String Address;
    private int numberPeople;

    public Family() {
        this.giaDinh=new ArrayList<>();
    }

    public Family( String address, int numberPeople1) {
        this.giaDinh=new ArrayList<>();
        Address = address;
        this.numberPeople = numberPeople1;
    }

    public ArrayList<Person> getGiaDinh() {
        return giaDinh;
    }

    public void setGiaDinh(ArrayList<Person> giaDinh) {
        this.giaDinh = giaDinh;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }
    public int add(Person nguoi){
        this.giaDinh.add(nguoi);
        numberPeople++;
        return numberPeople;
    }
    public void remove( String name){
        for (int i = 0; i < giaDinh.size();i++)
            if(giaDinh.get(i).getName().equals(name)){
                giaDinh.remove(giaDinh.get(i));
                break;
            }

    }
    public int search(String name){
        for(int i=0;i<giaDinh.size();i++){
            if(giaDinh.get(i).getName().equals(name)){
                return i ;
            }
        }
        return -1;
    }
    public void edit(String name, Person person){
        giaDinh.set(search(name), person);
    }
    public void display(){
        for(int i=0;i<giaDinh.size();i++){
            System.out.println(this.giaDinh.get(i).toString());
        }
        System.out.println("Dia Chi "+Address +", So Thanh Vien "+ getNumberPeople());
    }
    public Person Max(){
        int max=giaDinh.get(0).getAge();
        for(int i=0;i<giaDinh.size();i++){
            if(giaDinh.get(i).getAge()>max){
                max=giaDinh.get(i).getAge();

            }
        }
        return giaDinh.get(search(max));
    }
    public Person Min(){
        int min=giaDinh.get(0).getAge();
        for (int i = 0; i <giaDinh.size() ; i++) {
            if(giaDinh.get(i).getAge()<min){
                min=giaDinh.get(i).getAge();
            }
        }
        return giaDinh.get(search(min));
    }
    public int search(int age){
        for(int i=0;i<giaDinh.size();i++){
            if(giaDinh.get(i).getAge()==age){
                return i ;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Family{" +
                "giaDinh=" + giaDinh +
                ", Address='" + Address + '\'' +
                ", NumberPeople=" + numberPeople +
                '}';
    }
}
