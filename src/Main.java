import zadanie2.Eanglish;
import zadanie2.Language;
import zadanie2.Polish;
import zadanie2.Zadanie2;
import zadanie3.Kadry;
import zadanie4.Employee;
import zadanie5.Lista;

public class Main {
    public static void main(String[] args) {
//        Zadanie1 zadanie = new Zadanie1();
//        zadanie.execute();

//        Zadanie2 zadanie2 = new Zadanie2();
//        Eanglish eanglish = new Eanglish();
//        Polish polish = new Polish();
//        Language[] languages = new Language[2];
//        languages[0] = polish;
//        languages[1] = eanglish;
//        zadanie2.execute(languages);

//        Kadry kadry = new Kadry();
//        kadry.odczytajZPliku();
//        kadry.importujZPlikuTekstowego("pracownicy.txt");
//        kadry.pisz();
//        kadry.zapiszDoPliku();

//        Employee[] employees = new Employee[100];
//        Employee.readFromTextFile("employees.txt", employees);
//        double mediumWomenSalarySection3 = Employee.mediumSalary(employees, 3, 'K');
//        System.out.println("Średnie wynagrodzenie kobiet z działu 3: " + mediumWomenSalarySection3);
//        Employee.saveToFile("employees.dat", employees);
//        Employee.readFromFile("employees.dat", employees);

        // zadanie5 Lista
        final int N = 10;
        Lista l = new Lista(N);
        for (int i = 0; i < N / 2; ++i) {
            l.addElement((1 << i));
        }
        l.addElement(2);
        l.addElement(8);
        l.write();
        l.removeFirst(2);
        l.write();
        for (int i = 0; i < N / 2; ++i) {
            l.addElement((1 << i));
        }
        l.write();
        System.out.println("List after removal of the repeats");
        l.removeRepeats();
        l.write();
    }
}