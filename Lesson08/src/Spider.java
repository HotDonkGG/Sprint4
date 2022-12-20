public class Spider extends Pet{
    public Spider() {
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
        return "бульк";
    }

    public Spider(String voice) {
        super(voice);
    }

    @Override
    public void setPawnsCount(int pawnsCount) {
        super.setPawnsCount(pawnsCount);
    }
}
