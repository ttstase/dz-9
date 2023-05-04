import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Vasyl", "Petrenko", 63);
        Woman woman = new Woman("Maria", "Lysenko", 62);

        woman.registerPartnership(man);

        System.out.println("Ім'я - " + man.getFirstName()
                + ", Прізвище - " + man.getLastName()
                + ", Вік - " + man.getAge());

        if (man.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");

        System.out.println("Ім'я - " + woman.getFirstName()
                + ", Прізвище - " + woman.getLastName()
                + ", Вік - " + woman.getAge());

        if (woman.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");
    }
}