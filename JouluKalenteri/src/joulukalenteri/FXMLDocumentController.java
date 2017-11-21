/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joulukalenteri;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author s1601402
 */
public class FXMLDocumentController implements Initializable {
private int luukut;
PaivamaaranTarkistus pvm = new PaivamaaranTarkistus();




//    FXMLDocumentController(int luukut) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

public  FXMLDocumentController(){
//  avatut = MainJouluKalenteri.luukutt;

}

    @FXML
    private Button Day1;

    @FXML
    private void openNewWindow(ActionEvent event) {

    }



        

    @FXML
    private void handleDay1(ActionEvent event) {
luukut = pvm.getLuukut();
if (luukut >= 1){

        System.out.println("Hyvää joulua!");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Kuva1.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day1");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");


        }

}
    }

    @FXML
    private void handleDay2(ActionEvent event) {
if (luukut >= 2){
  
        System.out.println("Hyvää joulua!");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Kuva1.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day1");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");


        }
}
    }

    @FXML
    private void handleDay3() {
if (luukut >= 3){
    System.out.println("bim");
}

    }

    @FXML
    private void handleDay4() {
if (luukut >= 4){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay5() {
if (luukut >= 5){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay6() {
if (luukut >= 6){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay7() {
if (luukut >= 7){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay8() {
if (luukut >= 8){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay9() {
if (luukut >= 9){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay10() {
if (luukut >= 10){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay11() {
if (luukut >= 11){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay12() {
if (luukut >= 12){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay13() {
if (luukut >= 13){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay14() {
if (luukut >= 14){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay15() {
if (luukut >= 15){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay16() {
if (luukut >= 16){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay17() {
if (luukut >= 17){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay18() {
if (luukut >= 18){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay19() {
if (luukut >= 19){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay20() {
if (luukut >= 20){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay21() {
if (luukut >= 21){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay22() {
if (luukut >= 22){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay23() {
if (luukut >= 23){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay24() {
if (luukut >= 24){
    System.out.println("bim");
}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
