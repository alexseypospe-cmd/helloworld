public class Main {
    public static void main(String[] args) {
        //задание 1
        int a = 3000;
        System.out.println("Значене переменной a с типом int равно "+a);
        byte b = 30;
        System.out.println("Значене переменной b с типом byte равно "+b);
        short c = 300;
        System.out.println("Значене переменной c с типом short равно "+c);
        long d = 300000;
        System.out.println("Значене переменной d с типом long равно "+d);
        float e = 3.14f;
        System.out.println("Значене переменной e с типом float равно "+e);
        double f = 3.14159265;
        System.out.println("Значене переменной f с типом double равно "+f);
        //задание 2
        float big = 27.12f;
        long son = 987678965549L;
        double moon = 2.786;
        var numb = 569;
        short cool = -159;
        int out = 27897;
        byte good = 67;
        //задание 3
        byte studentsLuda = 23;
        byte studentsAnna = 27;
        byte studentsKaty = 30;
        int studentsUnion =studentsLuda + studentsAnna + studentsKaty;
        int paper = 480;
        int studentPaper = paper/studentsUnion;
        System.out.println("На каждого ученика расчитано " + studentPaper + " листов бумаги");
        // задание 4
        int bottles = 16;
        int time = 2;
        int bottlesOne = bottles/time;
        int timeA = 20;
        int time20 = bottlesOne*20;
        System.out.println("За "+timeA+" минут "+"машина произвела "+time20+" штук бутылок");
        int timeDay = bottlesOne*(24*60);
        System.out.println("За сутки "+"машина произвела "+timeDay+" штук бутылок");
        int time3Day = 3*timeDay;
        System.out.println("За 3 суток "+"машина произвела "+time3Day+" штук бутылок");
        int time30Day = 30*timeDay;
        System.out.println("За 30 суток "+"машина произвела "+time30Day+" штук бутылок");
        // задание 5
        int pot = 120;
        int potWhite = 2;
        int potBrown = 4;
        int whiteBrown = potWhite + potBrown;
        int classRoom = pot / whiteBrown;
        int totalWhite = classRoom * potWhite;
        int totalBrown =classRoom * potBrown;
        System.out.println("В школе, где "+classRoom+" классов,нужно "+totalWhite+" банок белой краски и "+totalBrown+" банок коричневой краски");
        // задание 6
        int bananas = 5;
        int milk = 200;
        int milk1 = 100;
        double milkWeight = 105;
        double density = milkWeight / milk1;
        double massMilk2 = milk * density;
        double kg = 1000;
        int iceCream = 2;
        int eggs = 4;
        int bananasWeight = 80;
        int icecreamWeight = 100;
        int eggsWeight = 70;
        int bananasWeight1 = bananas * 80;
        int icecreamWeight1 = iceCream * 100;
        int eggsWeight1 = eggs * 70;
        double productsWeight = bananasWeight1 + massMilk2 + icecreamWeight + eggsWeight1;
        double productsWeight1 = productsWeight / kg;
        double productsWeight2 = productsWeight % kg;
        System.out.println("Общий вес продуктов "+productsWeight+" гр.");
        System.out.println("Общий вес продуктов "+productsWeight1+" кг.");
        System.out.println("Общий вес продуктов "+productsWeight2+" гр.");
        // задание 7
        int weightKg = 7;
        double weightGram = weightKg * kg;
        double mass1 = 250;
        double mass2 = 500;
        double totalDay1 = weightGram / mass1;
        double totalDay2 = weightGram / mass2;
        System.out.println("Нужно "+totalDay1+" дней,чтобы похудеть на "+weightKg+" кг."+" теряя "+mass1+" гр. в день.");
        System.out.println("Нужно "+totalDay2+" дней,чтобы похудеть на "+weightKg+" кг."+" теряя "+mass2+" гр. в день.");
        double totalDays = totalDay1 + totalDay2;
        double totalDay3 = totalDays / 2;
        System.out.println("В среднем нужно "+totalDay3+" день чтобы добиться результата похудения");
        // задание 8
        int salary1 = 67760;
        float salary2 = 83690;
        int salary3 = 76230;
        int percent = 10;
        double salaryYear1 = salary1 * 12;
        // зп. до повышения в год
        double salaryPercent1 = salary1*(1+10.0/100);
        // зп.после повышения
        double percentYear = salaryPercent1 * 12;
        //зп.после повышения в год
        double difference = percentYear - salaryYear1;
        // разница в зарплате в год
        System.out.println("Маша теперь получает "+salaryPercent1+" рублей."+" Годовой доход вырос на "+difference+" рублей");
        float salaryYear2 = salary2 * 12;
        double salaryPercent2 = salary2 * (1+10.0/100);
        double percentYear2 = salaryPercent2 * 12;
        double difference2 = percentYear2 - salaryYear2;
        System.out.println("Денис теперь получает "+salaryPercent2+" рублей."+" Годовой доход вырос на "+difference2+" рублей");
        double salaryYear3 = salary3 * 12;
        double salaryPercent3 = salary3*(1+10.0/100);
        double percentYear3 = salaryPercent3 * 12;
        double difference3 = percentYear3 - salaryYear3;
        System.out.println("Кристина теперь получает "+salaryPercent3+" рублей."+" Годовой доход вырос на "+difference3+" рублей");


    }
}