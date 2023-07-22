zadanie3:<br />
Napisać program do zarządzania danymi działu kadr w firmie. W tym celu należy napisać klasy
Pracownik oraz Kadry.<br />
Klasa Pracownik powinna przechowywać następujące dane jako pola prywatne:<br />
imię – typu String;<br />
nazwisko – typu String;<br />
placa – typu double;<br />
plec – typu char;<br />
dzial – typu int;<br />
Dodatkowo klasa Pracownik powinna zawierać:<br />
1. konstruktor umożliwiający przypisanie wartości wszystkim polom klasy;<br />
2. metodę toString (nadpisanie metody z klasy Object), która zwraca łańcuch zawierający dane
pracownika;<br />
3. metodę czyPracujeWDziale, która zwraca true, jeżeli pracownik pracuje w dziale o
podanym numerze<br />

Klasa Kadry służy do przechowywania i zarządzania listą zatrudnionych pracowników i posiada
następujące pola prywatne:<br />
private Pracownik [] pracownicy_;<br />
private int zatrudnienie_;<br />
Pole zatrudnienie_ przechowuje aktualną liczbę pracowników firmy, których dane przechowywane
są w tablicy pracownicy_. Firma nigdy nie będzie zatrudniać więcej niż 100 pracowników.
Klasa ta powinna mieć następujące metody:<br />
1) konstruktor inicjujący pola klasy, w tym przydzielający pamięć dla tablicy pracownicy_.
2) metodę dodajPracownika, która dołączy podanego jako parametr pracownika do tablicy
   pracownicy_, jeżeli jeszcze nie osiągnięto maksymalnego zatrudnienia;
3) metodę dodajPracownikaInteraktywnie, która pyta użytkownika o dane nowego
   pracownika, a następnie dodaje go do listy pracowników firmy.
4) metodę importujZPlikuTekstowego, która umożliwia wczytanie danych pracowników
   zapisanych w pliku tekstowym o nazwie podanej jako parametr metody. Dane pracowników
   zapisane są w formacie: Imię Nazwisko Płaca Płeć Nr działu
5) metodę sredniZarobek, której wynikiem jest średnia płaca pracowników w całej firmie;
6) metodę sredniZarobek(int dzial), której wynikiem jest średnia płaca pracowników
   podanego działu;
7) metodę dajDzialy, której wynikiem jest tablica typu int [] zawierająca numery działów, w
   których pracują zatrudnieni w firmie
8) metodę pisz, która wyświetla na ekranie informacje o pracownikach firmy oraz średnich
   zarobkach w całej firmie oraz poszczególnych działach;
9) metodę zapiszDoPliku, która zapisuje do pliku o podanej nazwie listę pracowników, ale
   w postaci binarnej przy użyciu mechanizmu serializacji
10) metodę odczytajZPliku, która odczytuje z pliku o podanej nazwie pracowników i dodaje
    ich do listy zatrudnionych. Dane pracowników zapisane są w pliku utworzonym za pomocą
    metody zapiszDoPliku, a więc należy użyć mechanizmu serializacji do ich odczytu.