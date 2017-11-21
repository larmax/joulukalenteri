/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joulukalenteri;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaivamaaranTarkistus {

    private Date tamaPaiva = new Date();

    private boolean after(String date) {

        //Päivämäärät tulee olla tässä muodossa
        Date eka = new Date();

        //Muunnetaan String dateksi, jotta voimme myöhemmin vertailla.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            eka = sdf.parse(date);

        } catch (ParseException ex) {

        }
        if (tamaPaiva.after(eka)) {
            return true;
        } else {
            return false;
        }

    }

}
