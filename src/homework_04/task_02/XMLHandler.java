package homework_04.task_02;

import java.util.Scanner;

public class XMLHandler extends AbstractHandler{

    private final String TAPEDock = "XML";
    private String nameDock =  "default_name";
    private String structureDock =  "default structure";
    private BDHandler bdHandler = new BDHandler(nameDock,structureDock,TAPEDock);

    @Override
    public void open() {   // открытым
    bdHandler.outName();
        menuQ();
    }

    @Override
    public void create() { // Создайте
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название " + TAPEDock + " документа |");
        String nameDock =  input.next();
        System.out.print("Содержание " + TAPEDock +  " |");
        String structureDock =  input.next();
        this.nameDock = nameDock;
        this.structureDock = structureDock;
        this.bdHandler = new BDHandler(nameDock,structureDock,TAPEDock);
        save();
    }

    @Override
    public void change() { // изменение
        create();
    }

    @Override
    public void save() { //сохранять
        System.out.print("Документ " + TAPEDock + " сохранили в ");
        bdHandler.outNameSave();
        menuQ();
    }

    @Override
    public void menuQ() {   // меню
        System.out.println("\nМеню " +TAPEDock+ " редактора. Выберите Действие | OPEN | CHANGE | IN_Main | CREATE | EXIT |");
        Scanner input = new Scanner(System.in);
        System.out.print("| ");
        String typeDock =  input.next();
        switch (typeDock) {
            case "OPEN":
                open();
                break;
            case "CHANGE":
                change();
                break;
            case "CREATE":
                create(); // +
                break;
            case "IN_Main":
                Main.metDock();
                break;
            case "EXIT":
                System.out.println("Программа закрыта");
                break;
        }
    }
}
