package Simple;
import java.util.Scanner;

public class CinemaAdviser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Это программа поможет найти фильм, который будет вам по душе.");
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();

        System.out.println("Здравствуйте, " + name + " !");

        System.out.println("Фильм какого жанра вы бы хотели посмотреть: комедия, драма, фантастика, триллер, боевик");

        String genre = scanner.nextLine();
            if (genre.equals("комедия") || genre.equals("Комедия")) {
                System.out.println("Вы хотите посмотреть отечественный или зарубежный?");
                String country = scanner.nextLine();
                if (country.equals("отечественный")) {
                    System.out.println("В таком случае предлагаю посмотреть следующие фильмы:");
                    System.out.println("\n* Иван Высильевич");
                    System.out.println("* Операция Ы");
                }
                else
                {
                    System.out.println("В таком случае предлагаю посмотреть следующие фильмы:");
                    System.out.println("\n* Безумная свадьба");
                    System.out.println("* Горячие головы");
                }
            }

            else if (genre.equals("фантастика")) {

                System.out.println("В таком случае предлагаю посмотреть следующие фильмы:");
                System.out.println("* Игра Эндера");
                System.out.println("* Звёздный путь");
            }

            else if (genre.equals("драма")) {

                System.out.println("В таком случае предлагаю посмотреть следующие фильмы:");
                System.out.println("* Движение вверх");
                System.out.println("* Властелин колец");
            }

            else if (genre.equals("триллер")) {

                System.out.println("В таком случае предлагаю посмотреть следующие фильмы:");
                System.out.println("* Время первых");
                System.out.println("* Пасажиры");
            }

            else {
                System.out.println("Вы не выбрали жанр. В таком случае предлагаю посмотреть мультики:");
                System.out.println("* South Park");
                System.out.println("* The Simpsons");
            }

            }
}

