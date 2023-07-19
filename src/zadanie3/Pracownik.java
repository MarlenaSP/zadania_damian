package zadanie3;


public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    public boolean czyPracujeWDziale(int dzial) {
        return this.dzial == dzial;
    }

    @Override
    public String toString() {
        return "imie= " + imie +
                ", nazwisko= " + nazwisko +
                ", placa= " + placa +
                ", plec= " + plec +
                ", dzial= " + dzial;
    }

    public double getPlaca() {
        return placa;
    }
}
