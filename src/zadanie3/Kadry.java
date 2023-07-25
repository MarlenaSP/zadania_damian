package zadanie3;

import java.io.*;

public class Kadry {
    private Pracownik[] pracownicy;
    private int zatrudnienie;

    public Kadry() {
        pracownicy = new Pracownik[100];
        zatrudnienie = 0;
    }

    public void dodajPracownika(Pracownik pracownik) {
        if (zatrudnienie < 100) {
            pracownicy[zatrudnienie] = pracownik;
            zatrudnienie++;
        } else {
            System.out.println("Nie można dodać pracownika");
        }
    }

    public void dodajPracownikaInteraktywnie() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Podaj dane nowego pracownika");
            System.out.println("imię: ");
            String imie = bufferedReader.readLine();
            System.out.println("nazwisko: ");
            String nazwisko = bufferedReader.readLine();
            System.out.println("płaca: ");
            double placa = Double.parseDouble(bufferedReader.readLine());
            System.out.println("płeć M/K: ");
            char plec = bufferedReader.readLine().charAt(0);
            System.out.println("dział: ");
            int dzial = Integer.parseInt(bufferedReader.readLine());

            Pracownik pracownik = new Pracownik(imie, nazwisko, placa, plec, dzial);
            dodajPracownika(pracownik);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void importujZPlikuTekstowego() {
        try {
            File file = new File("pracownicy.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linia;
            while ((linia = bufferedReader.readLine()) != null) {
                String pracownikZPliku[] = linia.split(" ");
                String imie = pracownikZPliku[0];
                String nazwisko = pracownikZPliku[1];
                double placa = Double.parseDouble(pracownikZPliku[2]);
                char plec = pracownikZPliku[3].charAt(0);
                int dzial = Integer.parseInt(pracownikZPliku[4]);

                Pracownik pracownik = new Pracownik(imie, nazwisko, placa, plec, dzial);
                dodajPracownika(pracownik);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        } catch (IOException e) {
            System.out.println("Problem z wczytywaniem pliku...");
        }
    }

    public double sredniZarobek() {
        double sumaPlac = 0;
        for (int i = 0; i < zatrudnienie; i++) {
            sumaPlac += pracownicy[i].getPlaca();
        }
        return sumaPlac / zatrudnienie;
    }

    public double sredniZarobek(int dzial) {
        double sumaPlac = 0;
        int iloscPracownikowDzialu = 0;
        for (int i = 0; i < zatrudnienie; i++) {
            if (pracownicy[i].czyPracujeWDziale(dzial)) {
                sumaPlac += pracownicy[i].getPlaca();
                iloscPracownikowDzialu++;
            }
        } return sumaPlac/iloscPracownikowDzialu;
    }

//    public int dajDzialy(){
//        int[] dzialy = new int[];
//
//    }

    public void pisz(){
        System.out.println("Wczytano poprawnie dane pracowników z pliku");
        System.out.println("Liczba pracowników: " + zatrudnienie);
        for( int i = 0; i < zatrudnienie; i++){
            System.out.println(pracownicy[i]);
        }
        System.out.println("Średnia płaca w firmie wynosi: " + sredniZarobek());
        System.out.println("Średnia płaca w dziele 3 wynosi: " + sredniZarobek(3));
        System.out.println("Średnia płaca w dziele 4 wynosi: " + sredniZarobek(4));

        dodajPracownikaInteraktywnie();

        System.out.println("Liczba pracowników: " + zatrudnienie);
        for( int i = 0; i < zatrudnienie; i++){
            System.out.println(pracownicy[i]);
        }
        System.out.println("Średnia płaca w firmie wynosi: " + sredniZarobek());
        System.out.println("Średnia płaca w dziele 3 wynosi: " + sredniZarobek(3));
        System.out.println("Średnia płaca w dziele 4 wynosi: " + sredniZarobek(4));
    }

    public void zapiszDoPliku() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("pracownicy.data"));
            output.writeObject(pracownicy);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void odczytajZPliku() {
        try {
            FileInputStream fileInputStream = new FileInputStream("pracownicy.data");
            ObjectInputStream object = new ObjectInputStream(fileInputStream);
            pracownicy = (Pracownik[]) object.readObject();
            object.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}





