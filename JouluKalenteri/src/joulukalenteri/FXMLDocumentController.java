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
private int avatut;


//    FXMLDocumentController(int luukut) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

public  FXMLDocumentController(){
//  avatut = MainJouluKalenteri.luukutt;
    avatut = 5;
}

    @FXML
    private Button Day1;

    @FXML
    private void openNewWindow(ActionEvent event) {

    }



        

    @FXML
    private void handleDay1(ActionEvent event) {
if (avatut >= 1){''
    System.out.println("bim");
    try {
            Stage newStage = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("kuva.fxml"));

            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.setTitle("User dashboard");
            newStage.setResizable(false);
            newStage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

}
    }

    @FXML
    private void handleDay2() {
if (avatut >= 2){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay3() {
if (avatut >= 3){
    System.out.println("bim");
}

    }

    @FXML
    private void handleDay4() {
if (avatut >= 4){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay5() {
if (avatut >= 5){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay6() {
if (avatut >= 6){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay7() {
if (avatut >= 7){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay8() {
if (avatut >= 8){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay9() {
if (avatut >= 9){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay10() {
if (avatut >= 10){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay11() {
if (avatut >= 11){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay12() {
if (avatut >= 12){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay13() {
if (avatut >= 13){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay14() {
if (avatut >= 14){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay15() {
if (avatut >= 15){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay16() {
if (avatut >= 16){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay17() {
if (avatut >= 17){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay18() {
if (avatut >= 18){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay19() {
if (avatut >= 19){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay20() {
if (avatut >= 20){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay21() {
if (avatut >= 21){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay22() {
if (avatut >= 22){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay23() {
if (avatut >= 23){
    System.out.println("bim");
}
    }

    @FXML
    private void handleDay24() {
if (avatut >= 24){
    System.out.println("bim");
}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
