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
     int luukut = 1;
public int getLuukut(){
    return luukut;
}

    private Date tamaPaiva = new Date();

    int luukut(String date) {
        Date eka = new Date();
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 1; i < 24; i++) {

            try {
                if (tamaPaiva.after(eka = sdf.parse("" + i + "/11/2017"))) {

                }
                luukut += 1;
            } catch (ParseException ex) {
            }
        }
        return luukut;
    }

}