package joulukalenteri;

import java.util.Calendar;
import java.util.Date;

/**
 * @author s1601385
 */
public class PaivamaaranTarkistus {

    int luukut = 1;

    public int getLuukut() {
        return luukut;
    }

    private Date tamaPaiva = new Date();

    int luukut() {
        Date eka = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(eka);

        int day = cal.get(Calendar.DAY_OF_MONTH);
        int kk = cal.get(Calendar.MONTH) + 1;
        for (int i = 1; i < day; i++) {
            if (kk == 12) {
                luukut += 1;
            } else {
                luukut = 0;
            }

        }
        return luukut;
    }
}
