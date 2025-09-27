public class Main {
    public static void main(String[] args) {
        int age = 21;
        if (age >= 18 && age <= 21)
        {
            System.out.println("Ты не можеш пить,но можеш сесть за руль");}
        if (age < 7 || age > 18){
            System.out.println("Ты не ходиш в школу");}
        if (age < 7){
            System.out.println("Позови родителей.Кто тебя пустил за комп");
        }
        if (age >= 7 && age < 18){
            System.out.println("Иди на занятия,школота");
        }


    }
    }