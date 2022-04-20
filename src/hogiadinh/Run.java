package hogiadinh;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FamilyList familyList = new FamilyList();
        int choice=0;
        do {
            System.out.println("=====Menu==========");
            System.out.println("1 Them Thanh Vien:\n" +
                                "2.In Danh Sach Thanh Vien \n" +
                                "3. Thoat khoi menu\n"+
                                "4. Sua Ho Gia Dinh\n"+
                                "5.Tim Kiem Ho Gia Dinh\n"+
                                "6.Sap Xep Ho Gia Dinh\n"+
                                "7.Tim Ho Gia Dinh Co Nhieu Thanh Vien :\n"+
                                "8.Tim Thanh Vien Co Tuoi Nho Nhat\n"+
                                "9. Thoat Khoi Menu\n"
            );
            choice=scanner.nextInt();
            scanner.nextLine();
            if (choice==1){
                System.out.println("Nhap Ten : ");
                String nhapTen = scanner.nextLine();
                System.out.println("Nhap Tuoi : ");
                int nhapTuoi = scanner.nextInt();
                System.out.println("Nhap Nghe Nghiep : ");
                String job = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Nhap CMND : ");
                String Id = scanner.nextLine();
                Person person = new Person(nhapTen,nhapTuoi,job,Id);
                familyList.AddFamily(person);
            }else if (choice==2){
                familyList.printPerson();
            }else if (choice==3){

            }else if (choice==4){

            }else if (choice==5){

            }else if (choice==6){

            }else if (choice==7){

            }else if (choice==8){

            }else if (choice==9){

            }else if (choice==0){

            }

        } while (choice!=0);


//        Family family = new Family("hn", 0);
//        family.add(new Person("Son", 55, "IT", "112233"));
//        family.add(new Person("Son1", 66, "Nong Dan", "112255"));
//        family.add(new Person("Son2", 23, "Dia Chu", "112266"));
//
//        Family family1 = new Family("hanoi", 0);
//        family1.add(new Person("Son3", 10, "IT", "1122330"));
//        family1.add(new Person("Son4", 25, "Nong Dan", "1122551"));
//        family1.add(new Person("Son5", 79, "Dia Chu", "1122662"));
//        family1.add(new Person("Son10", 30, "Ho Tro Tai Chinh", "11226688"));
//
//        Family family2 = new Family("hanam", 0);
//        family2.add(new Person("Son6", 27, "IT", "1122332"));
//        family2.add(new Person("Son7", 49, "Nong Dan", "1122554"));
//        family2.add(new Person("Son8", 29, "Dia Chu", "1122665"));
//        family2.add(new Person("Son9", 35, "Trom Cho", "11"));
//        family2.add(new Person("Son15", 38, "Ban Rau", "556"));
//        Town town1 = new Town();
//        town1.add(family);
//        town1.add(family1);
//        town1.add(family2);
//        town1.display();
//        System.out.println("Ho Gia Dinh Co Nhieu Thanh Vien Nhat La : ");
//        town1.findMaxNumber();
//        System.out.println("--------------------");
//        family1.edit("Son10", new Person("Son11", 33, "Trom Cho", "25458585"));
//        family1.display();
//        System.out.println("----------------------Sap Xep Ho Gia Dinh theo thu tu tang dan ----------------");
//        town1.sortByMembers();
//        town1.display();
    }
}
