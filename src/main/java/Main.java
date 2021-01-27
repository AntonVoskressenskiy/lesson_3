import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай часло от 0 до 9 с трех попыток");
        int num_max = 9;
        int num_try = 3;
        int num_comp = (int) (Math.random() * num_max);

            while (num_try > 0){
                System.out.println("Введи число");
                int num_input = scanner.nextInt();
                if (num_input == num_comp){
                    System.out.println("Ты угадал!");
                    break;
                }
                  if (num_input > num_comp){
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                num_try--;

                }
            if (num_try == 0)
                System.out.println("Попыток больше нет!");


        System.out.println("Начать игру заново? Да? жми 1; Нет? нажми 0:");

            int answer = scanner.nextInt();
            if (answer == 1){
                main(null);
                System.out.println("Игра закончилась!");

            }
    }



 }












