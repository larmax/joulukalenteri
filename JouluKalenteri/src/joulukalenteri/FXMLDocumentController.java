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

    @FXML
    private Button Day1;

    @FXML
    private void openNewWindow(ActionEvent event) {

    }

    @FXML
    private void handleDay1(ActionEvent event) {
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

    @FXML
    private void handleDay2() {

    }

    @FXML
    private void handleDay3() {

    }

    @FXML
    private void handleDay4() {

    }

    @FXML
    private void handleDay5() {

    }

    @FXML
    private void handleDay6() {

    }

    @FXML
    private void handleDay7() {

    }

    @FXML
    private void handleDay8() {

    }

    @FXML
    private void handleDay9() {

    }

    @FXML
    private void handleDay10() {

    }

    @FXML
    private void handleDay11() {

    }

    @FXML
    private void handleDay12() {

    }

    @FXML
    private void handleDay13() {

    }

    @FXML
    private void handleDay14() {

    }

    @FXML
    private void handleDay15() {

    }

    @FXML
    private void handleDay16() {

    }

    @FXML
    private void handleDay17() {

    }

    @FXML
    private void handleDay18() {

    }

    @FXML
    private void handleDay19() {

    }

    @FXML
    private void handleDay20() {

    }

    @FXML
    private void handleDay21() {

    }

    @FXML
    private void handleDay22() {

    }

    @FXML
    private void handleDay23() {

    }

    @FXML
    private void handleDay24() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
