package zadanie4;

import zadanie3.Pracownik;

import java.io.*;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private char sex;
    private int section;

    private Employee[] employees;

    public Employee(String name, String surname, double salary, char sex, int section) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.sex = sex;
        this.section = section;
        employees = new Employee[99];
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", surname: " + surname +
                ", salary: " + salary +
                ", sex: " + sex +
                ", section: " + section;
    }

    public static int readFromTextFile(String nameFile, Employee[] employees) {
        int counter = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String dane[] = line.split(" ");
                String imie = dane[0];
                String nazwisko = dane[1];
                double placa = Double.parseDouble(dane[2]);
                char plec = dane[3].charAt(0);
                int dzial = Integer.parseInt(dane[4]);

                Employee employee = new Employee(imie, nazwisko, placa, plec, dzial);
                if (counter < 100) {
                    employees[counter] = employee;
                    System.out.println(employees);
                    counter++;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        } catch (IOException e) {
            System.out.println("File upload problem");
        }
        return counter;
    }
}
