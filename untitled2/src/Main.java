

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Professionals prof = new Professionals();
    ForeignProfesionals ForProf = new ForeignProfesionals();
    UsualPeople UsPeople = new UsualPeople();




        Scanner scanner = new Scanner(System.in);
        ArrayList < Integer > mylist = new ArrayList < Integer > ();
        System.out.println("Введите колличетсво людей");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            mylist.add(i);
        }

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
