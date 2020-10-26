import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Призывной возраст  от 18 до 27 лет:");
        System.out.println("Введите возраст призывника: ");
        short age = sc.nextShort();
        System.out.println("Возраст призывника: " + age + " лет.");
        if (age < 18) {
            System.out.println("Вам еще рано служить в армии");
        } else if (age >= 27) {
            System.out.println("Вам уже поздно служить в армии");
        } else {
            System.out.println("Ваше семейное положение: Married/Single: ");
            String married = sc.next();
            System.out.println("Наличие детей: Yes/No: ");
            String kids = sc.next();
            System.out.println("Введитe количество детей: ");
            int number_kids = sc.nextInt();
            System.out.println("You are " + married + " and you have " + number_kids + " kid/kids");
            if (married.equals("Married") && kids.equals("Yes") && number_kids >= 1) {
                System.out.println("Вам нужно заботиться о жене и детях");
            }
            else if (married.equals("Married") && kids.equals("No") && number_kids == 0) {
                System.out.println("Учитесь ли Вы сейчас: Yes/No: ");
                String study = sc.next();
                if (study.equals("Yes")) {
                    System.out.println("Мы готовы предложить Вам работу по специальности");
                }
                else {
                    System.out.println("Добро пожаловать в Вооруженные Силы РФ");
                }

            }

        }

    }
}