package homework_04.task_02;

import java.util.Scanner;

        /*
        Задание 2
        Используя IntelliJ IDEA, создайте проект. Требуется: Создайте класс AbstractHandler.
        В теле класса создать методы void open(), void create(), void change(), void save().
        Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
        Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования, сохранения определенного формата документа.
         */

public class Main {

    public static void main(String[] args) {
        metDock();
    }

    public static void metDock(){
        System.out.println("Выберите тип документа | XML | TXT | DOC | EXIT |");
        System.out.print("| ");
        Scanner input = new Scanner(System.in);
        String typeDock =  input.next();
        metCreator(typeDock);
    }

    public static void metCreator(String typeDock){

        switch (typeDock) {
            case "XML":
                AbstractHandler xmlO = new XMLHandler();
                xmlO.menuQ();
                break;
            case "TXT":
                AbstractHandler txtO = new TXTHandler();
                txtO.menuQ();
                break;
            case "DOC":
                AbstractHandler docO = new DOCHandler();
                docO.menuQ();
                break;
            case "EXIT":
                System.out.println("Программа закрыта");
                break;
        }
    }



    public static void inputLogic(){

        Boolean numbers = false;
        Boolean alf = false;

        System.out.print("Введите слово, например ваше имя или цифры | ");
        Scanner input = new Scanner(System.in);
        String myWord =  input.next();
        String str = myWord.toLowerCase(); // переводим все символы в нижний регистр
        char[] chars = str.toCharArray();   // преобразования строки в массив символов

        // массив символов для сравнения
        char[] charNumbers =   new char[]{'0','1','2','3','4','5','6','7','8','9'};
        char[] charAlf =   new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','й','ц','у','к','е','н','г','ш','щ','з','х','ъ','ф','ы','в','а','п','р','о','л','д','ж','э','я','ч','с','м','и','т','ь','б','ю',' ',};

        for (int i = 0; i < chars.length; i++) {
            if (alf) { break; }
            for (int l = 0; l < charAlf.length; l++){
                if (chars[i] == charAlf [l]) {
                    alf = true;
                    break;
                }
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (numbers) { break; }
            for (int l = 0; l < charNumbers.length; l++){
                if (chars[i] == charNumbers [l]) {
                    numbers = true;
                    break;
                }
            }
        }

        System.out.println("число " + numbers);
        System.out.println("буквы " + alf);

        if(numbers && alf){
            System.out.println("XML");
        } else if(numbers){
            System.out.println("EXL");
        } else {
            System.out.println("DOC");
        }

    }

}
