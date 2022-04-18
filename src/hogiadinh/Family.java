package hogiadinh;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person>giaDinh;
    private String Address;
    private int NumberPeople;

    public Family() {
        this.giaDinh=new ArrayList<>();
    }

    public Family( String address, int numberPeople) {
        this.giaDinh=new ArrayList<>();
        Address = address;
        NumberPeople = numberPeople;
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
        return NumberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        NumberPeople = numberPeople;
    }
    public int add(Person nguoi){
        this.giaDinh.add(nguoi);
        NumberPeople++;
        return NumberPeople;
    }
    public void remove( String name){
        for (int i = 0; i < giaDinh.size();i++)
            if(giaDinh.get(i).getName().equals(name)){
                giaDinh.remove(giaDinh.get(i));
                break;
            }

    }
    public void display(){
        for(int i=0;i<giaDinh.size();i++){
            System.out.println(this.giaDinh.get(i).toString());
        }
        System.out.println("Dia Chi "+Address +", So Thanh Vien "+ getNumberPeople());
    }

    @Override
    public String toString() {
        return "Family{" +
                "giaDinh=" + giaDinh +
                ", Address='" + Address + '\'' +
                ", NumberPeople=" + NumberPeople +
                '}';
    }
}
