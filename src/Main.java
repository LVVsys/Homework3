public class Main {
    public static void main(String[] args) {

        byte a = 10;
        short b = 27000;
        int c = 55555;
        long d = 23456789L;
        float e = 2.73f;
        double f = 3.748;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        double thirdNMumber = 2.786;
        int fourthNumber = 569;
        short fifthNumber = -159;
        int sixthNumber = 27897;
        byte seventhNumber = 67;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNMumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
        System.out.println(seventhNumber);

        int studentsLydPav = 23;
        int studentsAnnSerg = 27;
        int studentsEkAndr = 30;
        int sheetsOfPaper = 480;
        int sheetsToTheStudent = sheetsOfPaper/(studentsLydPav+studentsEkAndr+studentsAnnSerg);
        System.out.println("На каждого ученика рассчитано " + sheetsToTheStudent + " листов бумаги");

        int factBottIn2Min = 16;
        int x1Min = factBottIn2Min/2;
        int factBottIn20Min = x1Min * 20;
        int factBoottIn24H = x1Min * 60 * 24;
        int factBottIn3Days = factBoottIn24H * 3;
        int factBottIn30Days = factBottIn3Days * 10;
        System.out.println("За 20 минут машина произвела " + factBottIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + factBoottIn24H + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + factBottIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + factBottIn30Days + " штук бутылок");

        short totalCansPaint = 120;
        short whitePaintForOneClass = 2;
        short brownPaintForOneClass = 4;
        int allCansForOneClass = whitePaintForOneClass + brownPaintForOneClass;
        int allClassroom = totalCansPaint/allCansForOneClass;
        int whitePaintCans = whitePaintForOneClass * allClassroom;
        int brownPaintCans = brownPaintForOneClass * allClassroom;
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + whitePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски");

        int bananas = 5*80;
        int milk = 2*105;
        int icecream = 2*100;
        int eggs = 4*70;
        double weightBreakfastInGr = bananas + milk + icecream + eggs;
        double weightBreakfastInKg = weightBreakfastInGr/1000;
        System.out.println("Вес спорт завтрака " + weightBreakfastInGr + " гр.");
        System.out.println("Вес спорт завтрака " + weightBreakfastInKg + " Кг.");

        int goal = 7*1000;
        int if250PerDay = goal/250;
        int if500PerDay = goal/500;
        System.out.println("За " + if250PerDay + " дней, если худеть на 250гр. в день");
        System.out.println("За " + if500PerDay + " дней, если худеть на 500гр. в день");

        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        float increaseMaria = (salaryMaria * 0.1f) + salaryMaria;    //зп после повышения.
        int revenueMaria = salaryMaria * 12;                         //годовой доход.
        float revAfterIncMaria = increaseMaria * 12;                 //годовой доход после повышения.
        float diffMaria = revAfterIncMaria - revenueMaria;           //разница до и после повышения.
        float increaseDenis = (salaryDenis * 0.1f) + salaryDenis;    //зп после повышения.
        int revenueDenis = salaryDenis * 12;                         //годовой доход.
        float revAfterIncDenis = increaseDenis * 12;                 //годовой доход после повышения.
        float diffDenis = revAfterIncDenis - revenueDenis;           //разница до и после повышения.
        float increaseCristina = (salaryCristina * 0.1f) + salaryCristina;    //зп после повышения.
        int revenueCristina = salaryCristina * 12;                         //годовой доход.
        float revAfterIncCristina = increaseCristina * 12;                 //годовой доход после повышения.
        float diffCristina = revAfterIncCristina - revenueCristina;           //разница до и после повышения.

        System.out.println("Маша теперь получает " +increaseMaria+ " рублей. Годовой доход вырос на " +diffMaria+ " рублей");
        System.out.println("Денис теперь получает " +increaseDenis+ " рублей. Годовой доход вырос на " +diffDenis+ " рублей");
        System.out.println("Кристина теперь получает " +increaseCristina+ " рублей. Годовой доход вырос на " +diffCristina+ " рублей");


    }
}