public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

// Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов" + (boxer1Weight + boxer2Weight) + " кг!");
        System.out.println("Разница весов двух бойцов" + (boxer2Weight - boxer1Weight) + " кг!");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов (1 способ)" + (boxer2Weight - boxer1Weight) + " кг!");
        System.out.println("Разница весов двух бойцов (2 способ)" + (boxer2Weight % boxer1Weight) + " кг!");

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками" );

// Задача 1
        System.out.println("Задача 1");
        int pepper = 150000;
        System.out.println("Перец " + pepper);
        byte turmeric = 100;
        System.out.println("Куркума " + turmeric);
        short zira = 25000;
        System.out.println("Зира " + zira);
long paprika = 7500000;
        System.out.println("Паприка " + paprika);
float garlic = 2.3585f;
        System.out.println("Чеснок " + garlic);
double rosemary = 105.525d;
        System.out.println("Розмарин " + rosemary);

        // Задача 2
        System.out.println("Задача 2");
        double bayLeaf = 27.12;
        System.out.println("Лавровый лист " + bayLeaf);
        long cayennePepper = 987678965549L;
        System.out.println("Кайенский перец " + cayennePepper);
        float coriander = 2.786f;
        System.out.println("Кориандр " + coriander);
            short anise = 569;
        System.out.println("Анис " + anise);
        short barberry = -159;
        System.out.println("Барбарис " + barberry);
        short vanilla = 27897;
        System.out.println("Ваниль " + vanilla);
        byte carnation = 67;
        System.out.println("Гвоздика " + carnation);

        // Задача 3
        System.out.println("Задача 3");
        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short totalSheetsOfPaper = 480;
        int allStudents = lpStudents + asStudents + eaStudents;
        int paperForEveryone = totalSheetsOfPaper / allStudents;
        System.out.println("На каждого ученика расчитано " + paperForEveryone + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        byte time1 = 20;
        short time2 = 1440;
        short time3 = 4320;
        int time4 = 43200;
        int bottle1 = bottles * time1 / time;
        System.out.println("За " + time1 + " минут машина произвела бутылок " + bottle1 + " штук");
        int bottle2 = bottles * time2 / time;
        System.out.println("За "+ time2 + " минут машина произвела бутылок " + bottle2 + " штук");
        int bottle3 = bottles * time3 / time;
        System.out.println("За "+ time3 + " минут машина произвела бутылок " + bottle3 + " штук");
        int bottle4 = bottles * time4 / time;
        System.out.println("За "+ time4 + " минут машина произвела бутылок " + bottle4 + " штук");

        // Задача 5
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int totalPaintsOneClass = whitePaintOneClass + brownPaintOneClass;
        int totalClasses = totalPaint / totalPaintsOneClass;
        int totalWhitePaint = totalClasses * whitePaintOneClass;
        int totalBrownPaint = totalClasses * brownPaintOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int bananasRecipeWeight = 5 * bananaWeight;
        int milkRecipeWeight = 2 * milkWeight;
        int iceCreamRecipeWeight = 2 * iceCreamWeight;
        int eggRecipeWeight = 4 * eggWeight;
        int breakfastWeight = bananasRecipeWeight + milkRecipeWeight + iceCreamRecipeWeight + eggRecipeWeight;
        float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес завтрака " + breakfastWeightKg + " кг");

        // Задача 7
        System.out.println("Задача 7");
        byte loseWeight = 7;
        float weightLosePerDay1 = 0.25f;
        float weightLosePerDay2 = 0.5f;
float daysLoseWeight1 = loseWeight / weightLosePerDay1;
        System.out.println("Если спортсмен будет терять по " + weightLosePerDay1 + " кг в день, то он достигнет нужного веса за " + daysLoseWeight1 + " дней");
        float daysLoseWeight2 = loseWeight / weightLosePerDay2;
        System.out.println("Если спортсмен будет терять по " + weightLosePerDay2 + " кг в день, то он достигнет нужного веса за " + daysLoseWeight2 + " дней");
        float daysOnAverage = (daysLoseWeight2 + daysLoseWeight1) /2;
        System.out.println("Чтобы добиться результата похудения, потребуется " + daysOnAverage + " день");

        // Задача 8
        System.out.println("Задача 8");
int salaryMasha = 67760;
int salaryDenis = 83690;
int salaryKristina = 76230;
double salaryAfterIncreaseMasha = salaryMasha * 1.1;
double salaryAfterIncreaseDenis = salaryDenis * 1.1;
double salaryAfterIncreaseKristina = salaryKristina * 1.1;
int annualSalaryMashaBefore = salaryMasha * 12;
int annualSalaryDenisBefore = salaryDenis * 12;
int annualSalaryKristinaBefore = salaryKristina * 12;
double annualSalaryMashaAfter = salaryAfterIncreaseMasha * 12;
double annualSalaryDenisAfter = salaryAfterIncreaseDenis * 12;
double annualSalaryKristinaAfter = salaryAfterIncreaseKristina * 12;
double salaryDifferenceMasha = annualSalaryMashaAfter - annualSalaryMashaBefore;
double salaryDifferenceDenis = annualSalaryDenisAfter - annualSalaryDenisBefore;
double salaryDifferenceKristina = annualSalaryKristinaAfter - annualSalaryKristinaBefore;
        System.out.println("Маша теперь получает " + salaryAfterIncreaseMasha + " рублей. " + " Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterIncreaseDenis + " рублей. " + " Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterIncreaseKristina + " рублей. " + " Годовой доход вырос на " + salaryDifferenceKristina + " рублей");





















    }
}
