public class UkrainianHen extends Hen {
    String country = "Украина";
    public static int allCountEggs;

    public UkrainianHen(int countEggs) {
        super(countEggs);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return allCountEggs += countEggs;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна " + country + ". Я вынашиваю " + countEggs + " яиц в месяц";
    }
}
