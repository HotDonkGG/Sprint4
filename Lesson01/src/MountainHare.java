public class MountainHare {

    int age;
    double weight;
    double jumpLength;
    static String color;


    public MountainHare(int age, double weight, double jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;

    }

// добавьте переменные и конструктор

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}