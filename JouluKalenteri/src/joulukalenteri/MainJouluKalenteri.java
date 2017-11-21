/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joulukalenteri;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author s1601402
 */
public class MainJouluKalenteri extends Application {

    
       static int luukutt;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
              PaivamaaranTarkistus pvm = new PaivamaaranTarkistus();
        ArrayList paivat = new ArrayList();
    
       int luukut = 1;
        for (int i = 1; i<24; i++){
               if(pvm.after((""+i+"/11/2017"))){
                    paivat.add(""+i+"/11/2017");
                    luukut +=1;
                 
               }
           luukut = luukutt;
            
        }
        
//  KuvanVaihtaminen VaihaKuva = new KuvanVaihtaminen(paivat);
//    FXMLDocumentController controlleri = new FXMLDocumentController(luukut);


    }
    
    public int getLuukut(){
   return luukutt; 
}
    
}
