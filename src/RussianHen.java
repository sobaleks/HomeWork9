public class RussianHen extends Hen {

    String country = "Россия";
    public static int allCountEggs;

    public RussianHen(int countEggs) {
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
