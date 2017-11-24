/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joulukalenteri;

import java.util.Calendar;
import java.util.Date;

public class PaivamaaranTarkistus {

    int luukut = 1;

    public int getLuukut() {
        return luukut;
    }

    private Date tamaPaiva = new Date();

    int luukut() {
        Date eka = new Date();

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//String s = sdf.format(date);

   Calendar cal = Calendar.getInstance();
cal.setTime(eka);

int day = cal.get(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < day; i++) {

            luukut += 1;

        }
        return luukut;
    }

}