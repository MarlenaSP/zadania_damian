<h3><span style="color: blue">Zadanie 3:</span></h3>
Napisać program do zarządzania danymi działu kadr w firmie. W tym celu należy napisać klasy
Pracownik oraz Kadry.<br />
<b>Klasa Pracownik</b> powinna przechowywać następujące dane jako pola prywatne:
- imię – typu String;
- nazwisko – typu String;
- placa – typu double;
- plec – typu char;
- dzial – typu int;

Dodatkowo klasa Pracownik powinna zawierać:<br />
1. <b>konstruktor</b> umożliwiający przypisanie wartości wszystkim polom klasy;<br />
2. metodę <b>toString</b> (nadpisanie metody z klasy Object), która zwraca łańcuch zawierający dane
pracownika;<br />
3. metodę <b>czyPracujeWDziale</b>, która zwraca true, jeżeli pracownik pracuje w dziale o
podanym numerze.

<b>Klasa Kadry</b> służy do przechowywania i zarządzania listą zatrudnionych pracowników i posiada
następujące pola prywatne:
- private Pracownik [] pracownicy_;
- private int zatrudnienie_;
- Pole zatrudnienie_ przechowuje aktualną liczbę pracowników firmy, których dane przechowywane
są w tablicy pracownicy_. Firma nigdy nie będzie zatrudniać więcej niż 100 pracowników.

Klasa ta powinna mieć następujące metody:

1. <b>konstruktor</b> inicjujący pola klasy, w tym przydzielający pamięć dla tablicy pracownicy_
2. metodę <b>dodajPracownika</b>, która dołączy podanego jako parametr pracownika do tablicy
   pracownicy_, jeżeli jeszcze nie osiągnięto maksymalnego zatrudnienia;
3. metodę <b>dodajPracownikaInteraktywnie</b>, która pyta użytkownika o dane nowego
   pracownika, a następnie dodaje go do listy pracowników firmy; 
4. metodę <b>importujZPlikuTekstowego</b>, która umożliwia wczytanie danych pracowników
   zapisanych w pliku tekstowym o nazwie podanej jako parametr metody. Dane pracowników
   zapisane są w formacie: Imię Nazwisko Płaca Płeć Nr działu;
5. metodę <b>sredniZarobek</b>, której wynikiem jest średnia płaca pracowników w całej firmie; 
6. metodę <b>sredniZarobek(int dzial)</b>, której wynikiem jest średnia płaca pracowników
   podanego działu;
7. metodę <b>pisz</b>, która wyświetla na ekranie informacje o pracownikach firmy oraz średnich
   zarobkach w całej firmie oraz poszczególnych działach; 
8. metodę <b>zapiszDoPliku</b>, która zapisuje do pliku o podanej nazwie listę pracowników, ale
   w postaci binarnej przy użyciu mechanizmu serializacji 
9. metodę <b>odczytajZPliku</b>, która odczytuje z pliku o podanej nazwie pracowników i dodaje
    ich do listy zatrudnionych. Dane pracowników zapisane są w pliku utworzonym za pomocą
    metody zapiszDoPliku, a więc należy użyć mechanizmu serializacji do ich odczytu.
___

<h3><span style="color: teal">Zadanie 4:</span></h3>
Napisać program do zarządzanie danymi pracowników. W tym celu należy utowrzyć <b>klasę Pracownik</b> z następującymi polami:

- imię – typu String;
- nazwisko – typu String;
- placa – typu double;
- plec – typu char;
- dzial – typu int;

1. Klasę wyposażyć w konstruktor, którego parametry umożliwiają przypisanie wartości wszytskim polom klasy.
2. W klasie Pracownik stworzyć statyczną funkcję <b>wczytajZPlikuTekstowego</b>, której zadaniem jest odczytanie danych pracowników zapisanych w pliku tekstowym i utworzenie dla nich obiektów klasy Pracownik. Dane zapisane są w formacie:<br />
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Imię&nbsp;&nbsp; Nazwisko&nbsp;&nbsp; Płaca&nbsp;&nbsp; Płeć&nbsp;&nbsp; Dział <br />
 przykład:&nbsp;&nbsp;&nbsp;&nbsp;Jan&nbsp;&nbsp;&nbsp; Kowalski&nbsp;&nbsp;&nbsp; 2010&nbsp;&nbsp;&nbsp;&nbsp; M&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3&nbsp;&nbsp;<br />

Metoda wczytajZPlikuTekstowego przyjmuje 2 parametry:

   - nazwę pliku tekstowego z danymi pracowników,&nbsp;
   - tablicę do przechowywania wczytanych obiektów klasy Pracownik (maks. 100
     elementów)   <br />
Wynikiem metody powinna być liczba odczytanych danych (int)
3. Napisać metodę statyczną o nazwie <b>srednieZarobki</b>, której parametrem jest tablica
   pracowników, numer działu oraz płeć, a wynikiem średnia płaca osób pracujących w dziale
   o podanym numerze oraz o podanej płci.<br />
   Przykładowo wynikiem metody srednieZarobki dla kobiet z działu 3 w podanym
   przykładzie powinna być wartość 2500.
4. Napisać statyczną metodę <b>zapiszDoPliku</b>, której zadaniem będzie zapisanie obiektów
   (serializacja) typu pracownik do pliku o nazwie podanej jako pierwszy parametr. Drugim
   parametrem jest tablica obiektów typu Pracownik, które powinny zapisane do pliku.
5. Napisać statyczną metodę <b>odczytZPliku</b>, której zadaniem będzie wczytanie tablicy
   obiektów z pliku (zapisanych metodą zapiszDoPliku).
___

<h3><span style="color: teal">Zadanie 5:</span></h3>
Napisać <b>klasę Lista</b>, której zadaniem będzie przechowywać listę liczb całkowitych. Klasa ta mieć
następujące pola prywatne:
- int [] liczby; // tablica, w której przechowywane będą liczby
- int pojemnosc; // maksymalna liczba elementów, możliwych do przechowywania
- int rozmiar; // liczba przechowywanych elementów (liczb w tablicy ,,liczby'')<br />

Klasa Lista powinna mieć również następujące metody:
1. konstruktor z parametrem określającym pojemność, który przydziela pamięć dla tablicy
liczby oraz ustala wartości pozostałych pól klasy;
2. metodę <b>dodajElement</b>, która przyjmuje dokładnie jeden element – liczbę całkowitą,
  która dodawana jest do listy; w przypadku, gdy lista jest pełna powinien zostać wyświetlony
  komunikat o błędzie;
3. metodę <b>znajdź</b>., której jedynym parametrem powinna być szukana liczba, natomiast
  wynikiem pozycja podanej liczby w liście (licząc od 0) lub -1, gdy liczby nie ma na liście;
4. bezparametrową metodę <b>pisz</b>, która wypisuje informacje o liście, w tym jej rozmiar,
  pojemność oraz listę przechowywanych elementów;
5. metodę <b>usunPierwszy</b>, która usuwa pierwsze wystąpienie podanej jako parametr liczby,
  jeżeli znajduje się ona na liście, tzn. jeżeli podana liczba występuje więcej niż jeden raz, to
  usuwane jest jedynie pierwsze jej wystąpienie;
6. metodę <b>usunPowtorzenia</b>, która usuwa wszystkie powtórzenia elementów na liście,
  tzn. po jej wykonaniu na liście nie powinno być żadnych powtórzonych liczb;
7. metodę <b>zapiszDoPliku</b>, która zapisuje zawartość listy do pliku obiektowego, którego
  nazwa podana powinna być jako pierwszy parametr

Przykładowo, po wykonaniu poniższego fragmentu:<br />
public static void main(String [] args) {<br />
final int N = 10;<br />
Lista l = new Lista(N);<br />
for (int i = 0; i < N/2; ++i) {<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; l.dodajElement( (1 << i) );<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br />
l.dodajElement(2);<br />
l.dodajElement(8);<br />
l.pisz();<br />
l.usunPierwszy(2);<br />
l.pisz();<br />
for (int i = 0; i < N/2; ++i) {<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; l.dodajElement( (1 << i) )<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br />
l.pisz();<br />
System.out.println("Po usunięciu powtórzeń:");<br />
l.usunPowtorzenia();<br />
l.pisz();<br />
}<br />

Na ekranie powinno zostać wyświetlone:<br />
Lista:<br />
&nbsp;&nbsp;&nbsp;&nbsp; Pojemność: 10<br />
&nbsp;&nbsp;&nbsp;&nbsp; Rozmiar: 7<br />
&nbsp;&nbsp;&nbsp;&nbsp; Elementy: 1 2 4 8 16 2 8<br />
Lista:<br />
&nbsp;&nbsp;&nbsp;&nbsp; Pojemność: 10<br />
&nbsp;&nbsp;&nbsp;&nbsp; Rozmiar: 6<br />
&nbsp;&nbsp;&nbsp;&nbsp; Elementy: 1 4 8 16 2 8<br />
Nie można dodać nowego elementu, osiągnięto maks. pojemność!<br />
Lista:<br />
&nbsp;&nbsp;&nbsp;&nbsp; Pojemność: 10<br />
&nbsp;&nbsp;&nbsp;&nbsp; Rozmiar: 10<br />
&nbsp;&nbsp;&nbsp;&nbsp; Elementy: 1 4 8 16 2 8 1 2 4 8<br />
Po usunięciu powtórzeń:<br />
Lista:<br />
&nbsp;&nbsp;&nbsp;&nbsp; Pojemność: 10<br />
&nbsp;&nbsp;&nbsp;&nbsp; Rozmiar: 5<br />
&nbsp;&nbsp;&nbsp;&nbsp; Elementy: 16 1 2 4 8<br />

