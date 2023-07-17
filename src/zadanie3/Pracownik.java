package zadanie3;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial) {
        this.imie = this.imie;
        this.nazwisko = this.nazwisko;
        this.placa = this.placa;
        this.plec = this.plec;
        this.dzial = this.dzial;
    }

    public boolean czyPracujeWDziale (int dzial){
        return this.dzial == dzial;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                ", plec=" + plec +
                ", dzial=" + dzial +
                '}';
    }

}
