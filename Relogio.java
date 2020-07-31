import java.util.Scanner;

public class Relogio {
    int hora = 0, min = 0, seg = 0;

    public Relogio(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public void getHora() {
        System.out.printf("%d:%d:%d\n", hora, min, seg);
    }

    public String getTime() {
        return hora + ":" + min + ":" + seg;
    }

    public void setHora(int hora){
        if(hora>=0 && hora<24){
            this.hora = hora;
        }
    }

    public void setMin(int min){
        if(min>=0 && min<60){
            this.min= min;
        }
    }

    public void setSeg(int seg){
        if(seg>=0 && seg<60){
            this.seg= seg;
        }
    }

    public void contHora(int hora, int min, int seg) {
        for (; hora < 24; hora++) {
            for (; min < 60; min++) {
                for (; seg < 60; seg++){
                    //System.out.printf("%d:%d:%d\n", hora, min, seg);
                }
                seg = 0;
            }
            min = 0;
        }
        hora = 0;
        min = 0;
        seg = 0;
    }

}
