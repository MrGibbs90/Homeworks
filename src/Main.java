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
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");

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
        System.out.println("За " + time2 + " минут машина произвела бутылок " + bottle2 + " штук");
        int bottle3 = bottles * time3 / time;
        System.out.println("За " + time3 + " минут машина произвела бутылок " + bottle3 + " штук");
        int bottle4 = bottles * time4 / time;
        System.out.println("За " + time4 + " минут машина произвела бутылок " + bottle4 + " штук");

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
        float daysOnAverage = (daysLoseWeight2 + daysLoseWeight1) / 2;
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

        // ДЗ 1
        System.out.println("ДЗ 1");
        // Задача 1
        System.out.println("Задача 1");
        int ageRoman = 32;
        if (ageRoman >= 18) {
            System.out.println("Роман, поздравляем с совершеннолетием");
        }
        if (ageRoman < 18) {
            System.out.println("Извините Роман, возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        int ageAdult = 21;
        if (ageAdult >= 7 && ageAdult <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (ageAdult >= 18 && ageAdult <= 24) {
            System.out.println("Уже окончил школу и может отправляться в университет");
        }
        if (ageAdult >= 24) {
            System.out.println("Уже окончил университет и пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");
        byte carCapacity = 102;
        byte seating = 60;
        int standingPlaces = carCapacity - seating;
        int seatingUsed = 60;
        int standingPlacesUsed = 41;
        if (seatingUsed < seating) {
            System.out.println("Есть ещё " + (seating - seatingUsed) + " сидячих мест");
        }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("Есть ещё " + (standingPlaces - standingPlacesUsed) + " стоячих мест");
        }
        if (seatingUsed == seating) {
            System.out.println("Сидячих мест нет");
        }
        if (standingPlacesUsed == standingPlaces) {
            System.out.println("Стоячих мест нет");
        }
        // ДЗ 2
        System.out.println("ДЗ 2");
// Задача 1
        System.out.println("Задача 1");
        int ageAnastasia = 25;
        if (ageAnastasia >= 18) {
            System.out.println("Анастасия, поздравляем с совершеннолетием");
        } else {
            System.out.println("Извините Анастасия, возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        // Задача 2
        System.out.println("Задача 2");
        int ageChild = 9;
        if (ageChild >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (ageChild >= 18) {
                System.out.println("Уже окончил школу и может отправляться в университет");
            } else {
                if (ageChild >= 24) {
                    System.out.println("Уже окончил университет и пора искать первую работу");
                }
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        byte carCapacity1 = 102;
        byte seating1 = 60;
        int standingPlaces1 = carCapacity1 - seating1;
        byte peopleInCar1 = 53;
        if (peopleInCar1 >= 102) {
            System.out.println("Мест нет, вагон забит");
        } else {
            System.out.println("Места в вагоне есть, но не факт что сидячие");
        }
        if (peopleInCar1 >= 60) {
            System.out.println("Сидячих мест нет");
        } else {
            System.out.println("Сидячие места есть");
        }
        if (peopleInCar1 >= standingPlaces1) {
            System.out.println("Места в вагоне есть, но не факт что сидячие");
        }
        // ДЗ 3
        System.out.println("ДЗ 3");
        // Задача 1
        System.out.println("Задача 1");
        int age2 = 32;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в детский сад");
        } else {
            if (age2 >= 7 && age2 <= 18) {
                System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в школу");
            } else {
                if (age2 >= 18 && age2 <= 24) {
                    System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в университет");
                } else {
                    if (age2 >= 24) {
                        System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить на работу");
                    }
                }
            }
        }
        // Задача 2
        System.out.println("Задача 2");
        int age3 = 12;
        if (age3 < 5) {
            System.out.println("Если ребёнку " + age3 + " лет, то он не может кататься на атракционе");
        } else {
            if (age3 > 5 && age3 < 14) {
                System.out.println("Если ребёнку " + age3 + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                if (age3 > 14) {
                    System.out.println("Если ребёнку " + age3 + " лет, то он может кататься без сопровождения взрослого");
                }
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        int one = 234;
        int two = -5;
        int three = 150;
        if (one > two && one > three) {
            System.out.println(one + " самое большее из трёх чисел");
        } else {
            if (two > one && two > three) {
                System.out.println(two + " самое большее из трёх чисел");
            } else {
                if (three > one && three > two) {
                    System.out.println(three + " самое большее из трёх чисел");
                }
            }
        }

        // ДЗ 6
        System.out.println("ДЗ 6");
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        int clientDeviceYear = 2010;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        System.out.println("Задача 2");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// Задача 3
        System.out.println("Задача 3");
        int year = 1971;
        int leapYear1 = year % 4;
        int leapYear2 = year % 400;
        int leapYear3 = year % 100;
        if (leapYear2 == 0) {
            System.out.println("Високосный");
        } else if (leapYear1 == 0 && leapYear3 == 0) {
            System.out.println("Невисокосный");
        } else if (leapYear1 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

// Задача 5
        System.out.println("Задача 5");
        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц: " + monthNumber);
        }
// ДЗ 7
        System.out.println("ДЗ 7");
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                System.out.println(i + " год является високосным");
        }
        // Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

        // Задача 8
        System.out.println("Задача 8");
        int deposit = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

// Задача 9
        System.out.println("Задача 9");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + deposit) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
// ДЗ 8
        System.out.println("ДЗ 8");
        // Задача 1
        System.out.println("Задача 1");
        int month = 0;
        while (sum < 2_459_000) {
            sum += deposit;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        // Задача 2
        System.out.println("Задача 2");
        int w = 0;
        while (w < 10) {
            w++;
            System.out.print(w + " ");
        }
        System.out.println();
        int q = 0;
        for (w = 10; w >= 1; w--) {
            System.out.print(w + " ");
        }
        System.out.println();
        // Задача 3
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRate = 17 * totalPopulation / 1000;
        int mortality = 8 * totalPopulation / 1000;
        for (w = 1; w <= 10; w++) {
            totalPopulation += birthRate;
            totalPopulation -= mortality;
            System.out.printf("Год %d , численность %d \n", w, totalPopulation);
        }
        // Задача 4, 5, 6
        System.out.println("Задача 4, 5, 6");
        int initialDeposit = 15_000;
        int monthNum = 1;
        while (initialDeposit <= 12_000_000) {
            initialDeposit *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.printf("месяц %d , сумма %d \n", monthNum, initialDeposit);
            }
            monthNum++;
        }
        // Задача 7
        System.out.println("Задача 7");
        int friday = 1;
        for (int currentFriday = friday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "ое число. " + "Необходимо подготовить отчёт.");
        }
// Задача 8
        System.out.println("Задача 8");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
// Задача 9
        System.out.println("Задача 9");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + "= " + 2 * i);
        }


    }
}
