package zadanie2;

public class Polish implements Language {
    @Override
    public String sayGreeting() {
        return "Dzień dobry";
    }

    @Override
    public String sayGoodbye() {
        return "Do widzenia";
    }

    @Override
    public String sayThanks() {
        return "Dziękuje";
    }
}
