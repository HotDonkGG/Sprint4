public class Hamster extends Pet{
    public Hamster() {
        super();
    }

    @Override
    public String sleep() {
        return "Сплю";
    }

    @Override
    public String play() {
        return "Играю";
    }

    @Override
    public String giveVoice() {
        return "рэ";
    }

    public Hamster(String voice) {
        super(voice);
    }
    public static void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}
