public abstract class Pet {

    public Pet() {
    }


    public abstract String sleep();

    public abstract String play();

    public abstract String giveVoice();

    private int pawnsCount;

    public Pet(String voice) {
    }

    public int getPawsCount() {
        return pawnsCount;
    }

    public void setPawnsCount(int pawnsCount) {
        this.pawnsCount = pawnsCount;
    }
}
