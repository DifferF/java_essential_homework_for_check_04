package homework_04.task_02;

public class BDHandler {

    private String[] arrayName = new String[]{""};
    private String[] arrayFile = new String[]{""};
    private String[] arrayTape = new String[]{""};

    public BDHandler(String arrayName1, String arrayFile1, String arrayTape1) {
        this.arrayName[0] = arrayName1 + "_" + arrayTape1;
        this.arrayFile[0] = arrayFile1;
        this.arrayTape[0] = arrayTape1;
        }

    public void outName(){
        System.out.println("_____________________-");
        for (int i = 0; i < 1; i++) {
            System.out.println("Имя: " + arrayName [i]);
            System.out.println("Содержание: " + arrayFile [i]);
        }
    }

    public void outNameSave(){
            System.out.print(arrayName [0]);
        }
    }


