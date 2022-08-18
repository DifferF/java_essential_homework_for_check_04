package homework_04.task_03;

            /*
            Задание 3
            Используя IntelliJ IDEA, создайте проект.Требуется:
            Создайте 2 интерфейса Playable и Recodable.
            В каждом из интерфейсов создайте по 3 метода
            void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
            Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
            Написать программу, которая выполняет проигрывание и запись.
             */


import java.util.Objects;

public class Player implements Playable, Recodable {

    private String cassette;
    private String track_05 = "Запишите сюда свою песню, меню Record";

    private String[] array1 = new String[]{"Исполнитель_01", "Исполнитель_02", "Исполнитель_03", "Исполнитель_04", "For Record"};
    private String[] array2 = new String[]{"Play Трек_01", "Play Трек_02", "Play Трек_03", "Play Трек_04", track_05};

    public void executorImport() {
        System.out.println("Выберите исполнителя: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }
        System.out.print("|");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputKey = input.nextLine();

        for (int i = 0; i < 5; i++) {
            if (Objects.equals(array1[i], inputKey)) {
                this.cassette = array2[i];
            }
        }
        play();
    }

    @Override
    public void play() {
        System.out.println(cassette);
        pause();
    }


    @Override
    public void pause() {
        System.out.println("| Play | Executor | Stop | Record |");
        System.out.print("Сделайте выбор |");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputKey = input.nextLine();
        if (Objects.equals(inputKey, "Play")) {
            play();
        }
        if (Objects.equals(inputKey, "Stop")) {
            stop();
        }
        if (Objects.equals(inputKey, "Executor")) {
            executorImport();
        }
        if (Objects.equals(inputKey, "Record")) {
            record();
        }
    }

    @Override
    public void stop() {
        System.out.println("Stop Stop Stop");
    }

    @Override
    public void record() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Запишите вашу любимую песню: ");
        System.out.print("Идет запись |");
        this.array1[4] = "Record";
        this.array2[4] = input.nextLine();
        System.out.println("Ваша запись в меню Executor - <<Record>> ");
        pause();
    }
}
