public class AppRelogio {
    public static void main(String[] args) {
        Relogio clock;
        clock=new Relogio(17,42,00);
        clock.getHora();
        clock.setHora(18);
        System.out.println(clock.getTime());
        clock.setMin(70);
        System.out.println(clock.getTime());
        clock.setSeg(30);
        System.out.println(clock.getTime());
        clock.contHora(22,55,0);
        System.out.println(clock.getTime());
    }
}