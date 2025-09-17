public class Main {
    public static void main(String[] args) {
        // задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        // задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задание 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("масса бойца № 1 = " + boxerWeight1 +" кг." + "\n" + "масса бойца № 2 = " + boxerWeight2 + "кг." );
        var boxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров = " + boxersWeight + " кг.");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров = " + differenceWeight + " кг." );
        // задание 7
        var divisionWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Остаток деления = " + divisionWeight);
        //задание 8
        var a = 640;
        var b = 8;
        var result = a/b;
        System.out.println("Всего работников компании - " + result + " Человек" );
        var c = a/b + 94;
        var result1 = c * b;
        System.out.println("Если в компании работает " + c + " человек,то всего " + result1 + " часа работы может быть поделено между сотрудниками.");


    }
    }
