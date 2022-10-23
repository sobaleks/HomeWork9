public class BelarusianHen extends Hen {
    String country = "Беларусь";
    public static int allCountEggs;
    public BelarusianHen(int countEggs) {
        super(countEggs);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return allCountEggs+=countEggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна " + country + ". Я вынашиваю " + countEggs + " яиц в месяц";
    }
}
