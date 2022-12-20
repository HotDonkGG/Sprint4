// Выделите абстрактный класс Duck,
// который будет содержать общие свойства и методы классов FlyingDuck и RubberDuck
abstract class Duck {
    public Duck(String name) {
    }

    public void swim() {
        System.out.println("Да, я умею плавать!");
    }

    public void quack() {
        System.out.println("Кря!");

    }
}

class FlyingDuck extends Duck {
    public FlyingDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void quack() {
        super.quack();
    }

    public String getName() {
        return "Я - обычная утка. Кря!";
    }



    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }


}

class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void quack() {
        super.quack();
    }

    public String getName() {
        return "Я - резиновая уточка!";
    }



}


public class Main {

    public static void main(String[] args) {
        FlyingDuck flyingDuck = new FlyingDuck();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("Сначала о себе расскажет обычная уточка:");
        System.out.println(flyingDuck.getName());
        flyingDuck.swim();
        flyingDuck.fly();
        flyingDuck.eat();
        flyingDuck.quack();

        System.out.println("А теперь - резиновая:");
        System.out.println(rubberDuck.getName());
        rubberDuck.swim();
        rubberDuck.quack();
    }

}