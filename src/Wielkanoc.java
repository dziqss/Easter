import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Wielkanoc {

    public static void main(String[] args) {

        int rok;
        int dzienTyg;
        int mies;
        float a, b, c, d, e, f, g, h, i, k, l, m, p;

        Scanner year = new Scanner(System.in);
        System.out.println("podaj rok");
        rok = year.nextInt();



        a = rok % 19;
        b = (int) rok / 100;
        c = rok % 100;
        d = (int) b / 4;
        e = b % 4;
        f = (int) ((b + 8) / 25);
        g = (int) ((b - f + 1) / 3);
        h = (19 * a + b - d - g + 15) % 30;
        i = (int) c / 4;
        k = c % 4;
        l = (32 + 2 * e + 2 * i - h - k) % 7;
        m = (int) (a + 11 * h + 22 * l) / 451;
        p = (h + l - 7 * m + 114) % 31;

        dzienTyg = (int) p + 1;
        mies = (int) (h + l - 7 * m + 114) / 31 ;


        //musiałem dodać w kodzie zapis "-1" bo cały czas pokazywał mi maj w zaleznosci od podanego roku
        Calendar calendar = new GregorianCalendar(rok, mies-1, dzienTyg);
        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(dateFormat.format(date));


       /* if(mies==4){
            System.out.println(dzienTyg +" Kwietnia " + rok);
        }else{
            System.out.println(dzienTyg+ " Marzec " +rok);
        }
*/
}}
