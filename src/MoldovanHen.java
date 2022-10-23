public class MoldovanHen extends Hen{

    String country = "Молдовия";
    public static int allCountEggs;

    public MoldovanHen(int countEggs) {
        super(countEggs);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return allCountEggs+=countEggs;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна " + country + ". Я вынашиваю " + countEggs + " яиц в месяц";
    }
}
