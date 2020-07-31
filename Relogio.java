import java.util.Scanner;

public class Relogio {
    int hora = 0, min = 0, seg = 0;

    public void setHora() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite hora minuto segundo:");
        hora = in.nextInt();
        min = in.nextInt();
        seg = in.nextInt();
        for (; hora <=24; hora++) {
            for (; min < 60; min++) {
                for (; seg < 60; seg++){
                    System.out.printf("%d:%d:%d\n", hora, min, seg);
                    //public String getTime(){return hora + ":" + min + ":" + seg;}
                }
                    seg=0;
            }
            min=0;
        }
        hora=0;
        min=0;
        seg=0;
        //System.out.printf("%d:%d:%d\n", hora, min, seg);
    }

    public void getHora() {
        System.out.printf("%d:%d:%d\n", hora, min, seg);
    }

}
