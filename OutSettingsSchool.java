package SchoolGrade;

import java.util.Scanner;

public class OutSettingsSchool extends SettingsSchools {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    private int otvet;
    private String otvetSt;

    Scanner scan = new Scanner(System.in);

    void Hello(){
        System.out.println("## "+ ANSI_BLUE + "1.0 " + ANSI_RESET + "##          \n" +
                "#################################################################################################          \n" +
                "#################    " + ANSI_GREEN + "Здравствуйте! Вас приветствует создатель этой программы"+ ANSI_RESET +"    #################\n" +
                "####### "+ ANSI_GREEN +"Эта программа создана для ознокамления жителей Молодечно со школами этого города" + ANSI_RESET + "  #######\n" +
                "#################################################################################################\n" +
                "                                                                        #### "+ ANSI_BLUE +"TimoxaLipinskiy"+ ANSI_RESET +" ####\n" +
                "                                                                        #########################\n\n" );

        System.out.println("Вот что может делать эта программа: ");
    }

    void SetInfoFromScholl(){
        System.out.println("1) Показать список школ Молодечно\n" +
                           "2) Информация о школах\n" +
                           "3) Место нахождения школ\n");

        System.out.println("Что вы хотите сделать. Напишите номер выбора: ");
        otvet = scan.nextInt();

        if(otvet == 1){
            SetSchollMolo();

            System.out.print("Для продолжения напишите да, для закрытия программы напишите нет: ");
            scan.nextLine();
            otvetSt = scan.nextLine();

            if(otvetSt.equals("да") || otvetSt.equals("Да")) {
                System.out.println("\n");
                SetInfoFromScholl();
            }else{
                System.exit(0);
            }
        }else if(otvet == 2){
            System.out.print("Выберете номер школы: ");
            otvet = scan.nextInt();

            infoSchools(otvet);

            System.out.print("\n\nДля продолжения напишите да, для закрытия программы напишите нет: ");
            scan.nextLine();
            otvetSt = scan.nextLine();

            if(otvetSt.equals("да") || otvetSt.equals("Да")) {
                System.out.println("\n");
                SetInfoFromScholl();
            }else{
                System.exit(0);
            }
        } else if (otvet == 3) {
            LocationSchool();

            System.out.print("\n\nДля продолжения напишите да, для закрытия программы напишите нет: ");
            scan.nextLine();
            otvetSt = scan.nextLine();

            if(otvetSt.equals("да") || otvetSt.equals("Да")) {
                System.out.println("\n");
                SetInfoFromScholl();
            }else{
                System.exit(0);
            }
        }
    }

}
