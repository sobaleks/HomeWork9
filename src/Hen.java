public abstract class Hen {

    int countEggs;
    public static int allCountEggs;

    public Hen(int countEggs) {
        this.countEggs = countEggs;
        allCountEggs += countEggs;
    }

    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я курица.";
    }
}
