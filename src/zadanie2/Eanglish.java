package zadanie2;

public class Eanglish implements Language {
    @Override
    public String sayGreeting() {
        return "Good morning";
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye";
    }

    @Override
    public String sayThanks() {
        return "Thank you";
    }
}
