public class Main {
    public static void main(String[] args) {

    // Задача 1
        int intNum = 22;
        byte byteNum = 33;
        short shortNum = 44;
        long longNum = 55L;
        float floatNum = 6.6f;
        double doubleNum = 7.7;

        System.out.println("Значение переменной intNum с типом int равно " + intNum);
        System.out.println("Значение переменной byteNum с типом byte равно " + byteNum);
        System.out.println("Значение переменной shortNum с типом short равно " + shortNum);
        System.out.println("Значение переменной longNum с типом long равно " + longNum);
        System.out.println("Значение переменной floatNum с типом float равно " + floatNum);
        System.out.println("Значение переменной doubleNum с типом double равно " + doubleNum);

    // Задача 2
        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        double var3 = 2.786;
        boolean var4 = 10 < 5;
        int var5 = 569;
        short var6 = -159;
        char var7 = 27897;
        byte var8 = 67;

    // Задача 3
        var studentLyudmila = 23;
        var studentAnna = 27;
        var studentEkaterina = 30;
        var countPaper = 480;

        System.out.println("На каждого ученика рассчитано " + (countPaper / (studentLyudmila + studentAnna + studentEkaterina)) + " листов бумаги");

    // Задача 4
        int prodTwoMin = 16; // За 2 минуты, 16 бутылок
        int prodOneMin = prodTwoMin / 2; // За 1 минуту, 8 бутылок
        int prodTwentyMin = 20 * prodOneMin; // За 20 минут, 160 бутылок
        int prodDay = 24 * 60 * prodOneMin; // В сутки, 11_520 бутылок
        int prodThreeDay = prodDay * 3; // За 3 дня, 34_560 бутылок
        int prodMonth = prodDay * 31; // За 1 месяц, 357_120 бутылок

        System.out.println("За 20 минут машина произвела " + prodTwentyMin + " штук бутылок");
        System.out.println("В сутки машина произвела " + prodDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + prodThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + prodMonth + " штук бутылок");

    // Задача 5
        int countPaint = 120;
        int classWhite = 2;
        int classBrown = 4;

        int countClass = countPaint / (classWhite + classBrown); // Количество классов
        int countWhite = classWhite * countClass; // Количество банок белой краски
        int countBrown = classBrown * countClass; // Количество банок коричневой краски

        System.out.println("В школе, где " + countClass + " классов, нужно " + countWhite + " банок белой краски и " + countBrown + " банок коричневой краски");

    // Задача 6
        int bananasCount = 5;
        int milkCount = 200;
        int icecreamCount = 2;
        int eggsCount = 4;

        int bananasGram = bananasCount * 80; // Баныны в граммах
        int milkGram = milkCount / 100 * 105; // Молоко в граммах
        int icecreamGram = icecreamCount * 100; // Мороженное в граммах
        int eggsGram = eggsCount * 70;  // Яйца в граммах
        float breakfastWeightGram = bananasGram + milkGram + icecreamGram + eggsGram; // Общий вес завтрака в граммах
        float breakfastWeightKilogram = breakfastWeightGram / 1000; // Общий вес завтрака в килограммах

        System.out.println("Общий вес завтрака в граммах = " + breakfastWeightGram);
        System.out.println("Общий вес завтрака в килограммах = " + breakfastWeightKilogram);

    // Задача 7
        int kg = 7;
        int diet1 = 250;
        int diet2 = 500;

        int kgPerGr = kg * 1000; // Перевод в граммы
        int dayDiet1 = kgPerGr / diet1; // Количество дней, если будет терять 250 грамм
        int dayDiet2 = kgPerGr / diet2; //  Количество дней, если будет терять 500 грамм
        int averDays = (dayDiet1 + dayDiet2) / 2; // Среднее количество дней

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, на это уйдет " + dayDiet1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, на это уйдет " + dayDiet2 + " дней");
        System.out.println("Чтобы добиться результата похудения, в среднем может потребоваться " + averDays + " день");

    // Задача 8
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int percentMasha = salaryMasha * 10 / 100; // 10% от текущей зарплаты Маши
        int percentDenis = salaryDenis * 10 / 100; // 10% от текущей зарплаты Дениса
        int percentKristina = salaryKristina * 10 / 100; // 10% от текущей зарплаты Кристины
        int newSalaryMasha = salaryMasha + percentMasha; // Зарплата Маши после повышения на 10%
        int newSalaryDenis = salaryDenis + percentDenis; // Зарплата Дениса после повышения на 10%
        int newSalaryKristina = salaryKristina + percentKristina; // Зарплата Кристины после повышения на 10%
        int salaryDifYarMasha = (newSalaryMasha - salaryMasha) * 12; // Маша, разницу между годовым доходом до и после повышения
        int salaryDifYarDenis = (newSalaryDenis - salaryDenis) * 12; // Денис, разницу между годовым доходом до и после повышения
        int salaryDifYarKristina = (newSalaryKristina - salaryKristina) * 12; // Кристина, разницу между годовым доходом до и после повышения

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDifYarMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDifYarDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDifYarKristina + " рублей.");

    }
}