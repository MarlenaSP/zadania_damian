package zadanie2;

public class Zadanie2 {
    public void execute(Language[] languages) {
        for (Language l : languages) {
            System.out.println(l.sayGreeting());
            System.out.println(l.sayGoodbye());
            System.out.println(l.sayThanks());
        }
    }
}
