public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 500;
        int c = 1000;
        long d = 5000000L;
        float f = 33.33f;
        double g = 666.1234567;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + f);
        System.out.println("Значение переменной с типом double равно " + g);

        float a1 = 27.12f;
        System.out.println("Значение переменной с типом float равно " + a1);
        long b1 = 987678965549L;
        System.out.println("Значение переменной с типом long равно " + b1);
        double c1 = 2.786;
        System.out.println("Значение переменной с типом double равно " + c1);
        int d1 = 569;
        System.out.println("Значение переменной с типом int равно " + d1);
        short f1 = -159;
        System.out.println("Значение переменной с типом short равно " + f1);
        int g1 = 27897;
        System.out.println("Значение переменной с типом int равно " + g1);
        byte h1 = 67;
        System.out.println("Значение переменной с типом byte равно " + h1);

        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int purchasedPaper = 480;
        int forOne = (purchasedPaper / (studentsLP + studentsAS + studentsEA));
        System.out.println("На каждого ученика рассчитано " + forOne + " листов бумаги");

        int bottels = 16;
        int timeWork =2;
        int bottlesPer_minute =(bottels/timeWork);
        int bottledPer_20minute =(bottlesPer_minute * 20);
        System.out.println("За 20 минут машина произвела " + bottledPer_20minute + " штук бутылок");
        int bottlerPer_1day =(bottlesPer_minute * 60*24);
        System.out.println("За сутки машина произвела " + bottlerPer_1day + " штук бутылок");
        int bottlerPer_3day = (bottlesPer_minute * (60*24)*3);
        System.out.println("За 3 дня машина произвела " + bottlerPer_3day + " штук бутылок");
        long bottlerPer_1month = (bottlesPer_minute * (60*24)*30);
        System.out.println("За 1 месяц машина произвела " + bottlerPer_1month + " штук бутылок");

        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClass = (totalPaint / (whitePaint + brownPaint));
        int totalWhite_paint = (whitePaint * totalClass);
        int totalBrown_paint = (brownPaint * totalClass);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite_paint + " банок белой краски и " + totalBrown_paint + " банок коричневой краски");

        double banana = 5;
        double milk = 200;
        double icecream = 2;
        double egg = 4;
        double weightBanana = (banana * 80);
        double weightMilk = ((milk *105) /100);
        double weightIcecream = (icecream * 100);
        double weightEgg = (egg * 70);
        double totalWeight_gm = (weightBanana + weightMilk + weightIcecream + weightEgg);
        double totalWeight_kg =(totalWeight_gm / 1000);
        System.out.println("Вес спортзавтрака " + totalWeight_gm + " гр или " + totalWeight_kg + " кг" );

        float weight = 7;
        double diet1 = 250;
        double diet2 = 500;
        double dayDiet1 = (weight / diet1*1000);
        double dayDiet2 = (weight / diet2*1000);
        double dayAverage = ((dayDiet1 + dayDiet2)/2);
        System.out.println(dayDiet1 + " дней потребуется спортсмену если он будет терять по 250 грамм в день");
        System.out.println(dayDiet2 + " дней потребуется спортсмену если он будет терять по 500 грамм в день");
        System.out.println(dayAverage + " среднее количество дней необходимое для снижения веса");

        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double salaryMasha10 = (salaryMasha + (salaryMasha*10/100));
        double salaryDenis10 = (salaryDenis + (salaryDenis*10/100));
        double salaryKristina10 = (salaryKristina + (salaryKristina*10/100));
        double incomePerYearMasha = (salaryMasha * 12);
        double incomePerYearMasha10 = (salaryMasha10 * 12);
        double salaryDifferenceMasha = (incomePerYearMasha10 - incomePerYearMasha);
        double incomePerYearDenis = (salaryDenis * 12);
        double incomePerYearDenis10 = (salaryDenis10 * 12);
        double salaryDifferenceDenis = (incomePerYearDenis10 - incomePerYearDenis);
        double incomePerYearKristina = (salaryKristina * 12);
        double incomePerYearKristina10 = (salaryKristina10 * 12);
        double salaryDifferenceKristina = (incomePerYearKristina10 - incomePerYearKristina);
        System.out.println("Маша теперь получает " + salaryMasha10 + " рублей. Годовой доход вырос на " + salaryDifferenceMasha +  " рублей");
        System.out.println("Денис теперь получает " + salaryDenis10 + " рублей. Годовой доход вырос на " + salaryDifferenceDenis +  " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina10 + " рублей. Годовой доход вырос на " + salaryDifferenceKristina +  " рублей");
















    }

}