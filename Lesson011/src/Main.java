abstract class Rodent {
    public void crunch() {
        System.out.println("Грызун грызёт что угодно.");
    }

    public void sleep() {
        System.out.println("Грызун уснул.");
    }

    public abstract void dive();
}

class Capybara extends Rodent {

    @Override
    public void crunch() {
        System.out.println("Капибара любит грызть кукурузу.");
    }

    @Override
    public void sleep() {
        System.out.println("Капибара крепко спит.");
    }
    @Override
    public void dive() {
        System.out.println("Капибара умеет нырять.");
    }
}

public class Practicum {

    public static void main(String[] args) {
        Capybara capybara = new Rodent();
        capybara.crunch();
        capybara.sleep();
    }

}