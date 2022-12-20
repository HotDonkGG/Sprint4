public class Fish extends Pet {
    public Fish() {
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
        return "Бульк";
    }

    public Fish(String voice) {
        super(voice);
    }
}
