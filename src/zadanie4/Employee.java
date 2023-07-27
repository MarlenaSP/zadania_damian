package zadanie4;

import java.io.*;


public class Employee implements Serializable {
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
                String name = dane[0];
                String surname = dane[1];
                double salary = Double.parseDouble(dane[2]);
                char sex = dane[3].charAt(0);
                int section = Integer.parseInt(dane[4]);

                Employee employee = new Employee(name, surname, salary, sex, section);
                if (counter < 100) {
                    employees[counter] = employee;
                    System.out.println(employee);
                    counter++;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        } catch (IOException e) {
            System.out.println("File upload problem");
        }
        System.out.println("Liczba pracowników " + counter);
        return counter;
    }

    public static double mediumSalary(Employee[] employees, int nrSection, char sex) {
        int numberOfEmployeesSection = 0;
        int sumSalarySection = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.section == nrSection && employee.sex == sex) {
                numberOfEmployeesSection++;
                sumSalarySection += employee.salary;
            }
        }
        return (double) sumSalarySection / numberOfEmployeesSection;
    }

    public static void saveToFile(String fileName, Employee[] employees) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Employee[] readFromFile(String fileName, Employee[] employees) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            employees = (Employee[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
