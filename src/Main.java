import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person man = new Man("Vasyl", "Petrenko", 64);
        Person woman = new Woman("Maria", "Lysenko", 63);

        woman.registerPartnership(man);

        System.out.println("Ім'я - " + man.getFirstName()
                + ", Прізвище - " + man.getLastName()
                + ", Вік - " + Man.getAge());

        if (man.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");

        System.out.println("Ім'я - " + woman.getFirstName()
                + ", Прізвище - " + woman.getLastName()
                + ", Вік - " + Woman.getAge());

        if (woman.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");
    }
}