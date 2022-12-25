public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int first = 8;
        byte second = 10;
        short third = -1000;
        long fourth = -1000000L;
        float fifth = -10.9f;
        double sixth = 2545.4587;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth);

        System.out.println("Задача 2");
        double one = 27.12;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;
        System.out.println("Значение переменной one с типом double равно " + one);
        System.out.println("Значение переменной two с типом long равно " + two);
        System.out.println("Значение переменной three с типом double равно " + three);
        System.out.println("Значение переменной four с типом short равно " + four);
        System.out.println("Значение переменной five с типом short равно " + five);
        System.out.println("Значение переменной six с типом int равно " + six);
        System.out.println("Значение переменной seven с типом byte равно " + seven);

        System.out.println("Задача 3");
        byte studentsL = 23;
        byte studentsA = 27;
        byte studentsE = 30;
        short totalPapers=480;
        int totalStudents=studentsL+studentsA+studentsE;
        int papersOnOneStudent=totalPapers/totalStudents;
        System.out.println("На каждого ученика рассчитано по " +papersOnOneStudent+ " листов бумаги ");

        System.out.println("Задача 4");
        byte perfomanceBottles = 16;
        byte perfomanceMinutes = 2;
        int perfomanceBottlesInOneMinute = perfomanceBottles/perfomanceMinutes;
        int Za20=20;
        int Za24h=60*24;
        int Za3Days=60*24*3;
        int Za1mes=60*24*31;
        int BottlesZa20=perfomanceBottlesInOneMinute*Za20;
        int BottlesZa24h=perfomanceBottlesInOneMinute*Za24h;
        int BottlesZa3Days=perfomanceBottlesInOneMinute*Za3Days;
        int BottlesZa1mes=perfomanceBottlesInOneMinute*Za1mes;
        System.out.println("За 20 минут машина произвела "+BottlesZa20 +" штук бутылок");
        System.out.println("За сутки машина произвела "+BottlesZa24h +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+BottlesZa3Days +" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+BottlesZa1mes +" штук бутылок");

        System.out.println("Задача 5");
        byte totalTin = 120;
        byte white1class=2;
        byte brown1class=4;
        int totalclasses=totalTin/(white1class+brown1class);
        int totalWhite=white1class*totalclasses;
        int totalBrown=brown1class*totalclasses;
        System.out.println("В школе, где " +totalclasses+ " классов, нужно " +totalWhite+ " банок белой краски и "+totalBrown+" банок коричневой краски");

        System.out.println("Задача 6");
        byte bananas = 5;
        short milk=2;
        byte ice=2;
        byte eggs=4;
        byte bananasGr=80;
        byte milkGr=105;
        byte iceGr=100;
        byte eggsGr = 70;
        int TotalBananasGr=bananasGr*bananas;
        int TotalMilkGr=milkGr*milk;
        int TotaliceGr=iceGr*ice;
        int TotaleggsGr=eggsGr*eggs;
        double TotalGr=TotalBananasGr+TotalMilkGr+TotaliceGr+TotaleggsGr;
        double TotalKg=TotalGr/1000;
        System.out.println("Вес спортзавтрака: " +TotalGr+ " гр!");
        System.out.println("Вес спортзавтрака: " +TotalKg+ " кг!");

        System.out.println("Задача 7");
        byte weight=7;
        short minWeight=250;
        short maxWeight = 500;
        int weightGr=weight*1000;
        int daysMax=weightGr/minWeight;
        int daysMin=weightGr/maxWeight;
        int daysMid=(daysMax+daysMin)/2;

        System.out.println("Максимальное число дней (при похудении 250 гр/день): " +daysMax);
        System.out.println("Минимальное число дней (при похудении 500 гр/день): " +daysMin);
        System.out.println("Среднее число дней: " +daysMid);

        System.out.println("Задача 8");
        int Masha=67760;
        int Denis=83690;
        int Kris=76230;

        float Masha10=67760*1.1f;
        float Denis10=83690*1.1f;
        float Kris10=76230*1.1f;

        double MashaGod=Masha*365;
        double DenisGod=Denis*365;
        double KrisGod=Kris*365;

        double Masha10God=Masha10*365;
        double Denis10God=Denis10*365;
        double Kris10God=Kris10*365;

        double DifferenceMashaGod=Masha10God-MashaGod;
        double DifferenceDenisGod=Denis10God-DenisGod;
        double DifferenceKrisGod=Kris10God-KrisGod;

        System.out.println("Маша теперь получает " +Masha10+ " рублей. Годовой доход вырос на " +DifferenceMashaGod+" рублей");
        System.out.println("Денис теперь получает " +Denis10+ " рублей. Годовой доход вырос на " +DifferenceDenisGod+" рублей");
        System.out.println("Кристина теперь получает " +Kris10+ " рублей. Годовой доход вырос на " +DifferenceKrisGod+" рублей");
    }
}