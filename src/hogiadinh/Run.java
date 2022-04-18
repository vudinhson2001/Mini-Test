package hogiadinh;

public class Run {
    public static void main(String[] args) {
        Family hoGiaDinh = new Family( "hn" , 0);
        hoGiaDinh.add(new Person("Son", 21, "IT", "112233"));
        hoGiaDinh.add(new Person("Son1", 22, "Nong Dan", "112255"));
        hoGiaDinh.add(new Person("Son2", 23, "Dia Chu", "112266"));

        Family hoGiaDinh1 = new Family("hanoi" , 0);
        hoGiaDinh1.add(new Person("Son3", 24, "IT", "1122330"));
        hoGiaDinh1.add(new Person("Son4", 25, "Nong Dan", "1122551"));
        hoGiaDinh1.add(new Person("Son5", 26, "Dia Chu", "1122662"));
        hoGiaDinh1.add(new Person("Son10", 30, "Ho Tro Tai Chinh", "11226688"));

        Family hoGiaDinh2 = new Family( "hanam" , 0);
        hoGiaDinh2.add(new Person("Son6", 27, "IT", "1122332"));
        hoGiaDinh2.add(new Person("Son7", 28, "Nong Dan", "1122554"));
        hoGiaDinh2.add(new Person("Son8", 29, "Dia Chu", "1122665"));
        Town town1 = new Town();
        town1.add(hoGiaDinh);
        town1.add(hoGiaDinh1);
        town1.add(hoGiaDinh2);
        town1.display();

    }
}
