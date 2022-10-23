import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            switch (random.nextInt(1, 5)) {
                case 1:
                    //System.out.println(new RussianHen(random.nextInt(25, 60)).getDescription());
                    RussianHen hen_3 = new RussianHen(random.nextInt(30, 70));
                    System.out.println(hen_3.getDescription());
                    hen_3.getCountOfEggsPerMonth();
                    break;
                case 2:
                    // System.out.println(new UkrainianHen(random.nextInt(32, 73)).getDescription());
                    UkrainianHen hen_2 = new UkrainianHen(random.nextInt(30, 70));
                    System.out.println(hen_2.getDescription());
                    hen_2.getCountOfEggsPerMonth();
                    break;
                case 3:
                    // System.out.println(new MoldovanHen(random.nextInt(24, 56)).getDescription());
                    MoldovanHen hen_1 = new MoldovanHen(random.nextInt(30, 70));
                    System.out.println(hen_1.getDescription());
                    hen_1.getCountOfEggsPerMonth();
                    break;
                case 4:
                    // System.out.println(new BelarusianHen(random.nextInt(30, 75)).getDescription());
                    BelarusianHen hen_0 = new BelarusianHen(random.nextInt(30, 70));
                    System.out.println(hen_0.getDescription());
                    hen_0.getCountOfEggsPerMonth();
                    break;
            }
        }
        System.out.println();
        System.out.println("Общее колличество снесённых яиц за год в России равно " + RussianHen.allCountEggs * 12);
        System.out.println("Общее колличество снесённых яиц за год в Украине равно " + UkrainianHen.allCountEggs * 12);
        System.out.println("Общее колличество снесённых яиц за год в Молдавии равно " + MoldovanHen.allCountEggs * 12);
        System.out.println("Общее колличество снесённых яиц за год в Беларуси равно " + BelarusianHen.allCountEggs * 12);
        System.out.println("Общее колличество снесённых яиц за год равно " + Hen.allCountEggs * 12);
    }
}