/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joulukalenteri;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author s1601402
 */
public class FXMLDocumentController implements Initializable {

PaivamaaranTarkistus pvm = new PaivamaaranTarkistus();


private int luukut;



//    FXMLDocumentController(int luukut) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

public  FXMLDocumentController(){
        this.luukut = pvm.luukut();
//  avatut = MainJouluKalenteri.luukutt;

}




        

    @FXML
    private void handleDay1(ActionEvent event) {
luukut = pvm.getLuukut();
if (luukut >= 1){

        System.out.println("1");

        //avataan uusi ikkuna ja kutsutaan kuva-tiedostoa
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day1.fxml"));
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
  
        System.out.println("2");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day2.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day2");
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
    System.out.println("3");
    
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day3.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day3");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}

    }

    @FXML
    private void handleDay4() {
if (luukut >= 4){
    System.out.println("4");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day4.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day4");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay5() {
if (luukut >= 5){
    System.out.println("5");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day5.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day5");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay6() {
if (luukut >= 6){
    System.out.println("6");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day6.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day6");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay7() {
if (luukut >= 7){
    System.out.println("7");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day7.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day7");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay8() {
if (luukut >= 8){
    System.out.println("8");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day8.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day8");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay9() {
if (luukut >= 9){
    System.out.println("9");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day9.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day9");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay10() {
if (luukut >= 10){
    System.out.println("10");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day10.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day10");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay11() {
if (luukut >= 11){
    System.out.println("11");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day11.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day11");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay12() {
if (luukut >= 12){
    System.out.println("12");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day12.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day12");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay13() {
if (luukut >= 13){
    System.out.println("13");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day13.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day13");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay14() {
if (luukut >= 14){
    System.out.println("14");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day14.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day14");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay15() {
if (luukut >= 15){
    System.out.println("15");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day15.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day15");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay16() {
if (luukut >= 16){
    System.out.println("16");
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day16.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day16");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay17() {
if (luukut >= 17){
    System.out.println("17");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day17.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day17");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay18() {
if (luukut >= 18){
    System.out.println("18");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day18.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day18");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay19() {
if (luukut >= 19){
    System.out.println("19");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day19.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day19");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay20() {
if (luukut >= 20){
    System.out.println("20");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day20.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day20");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay21() {
if (luukut >= 21){
    System.out.println("21");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day21.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day21");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay22() {
if (luukut >= 22){
    System.out.println("22");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day22.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day22");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay23() {
if (luukut >= 23){
    System.out.println("23");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day23.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day23");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @FXML
    private void handleDay24() {
if (luukut >= 24){
    System.out.println("24");
    
    try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Day24.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Day24");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
