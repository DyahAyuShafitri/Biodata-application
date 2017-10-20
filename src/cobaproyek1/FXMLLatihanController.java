/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dyah Ayu Shafitri
 */
public class FXMLLatihanController implements Initializable {

     @FXML
    private TextField nama;

    @FXML
    private TextField alamat;

    @FXML
    private TextField absen;

    @FXML
    private TextField telepon;

    @FXML
    private JFXTextArea hasil;


 
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

@FXML
    void Hapus(ActionEvent event) {
          hasil.setText(" ");
        nama.setText(" ");
        alamat.setText(" ");
        absen.setText(" ");
        telepon.setText(" ");
    }
  
    @FXML
     void prosess(ActionEvent event) {
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        String Absen = absen.getText();
        String Telepon = telepon.getText();

        hasil.setText("Nama Anda"+Nama+"\n Alamat"+Alamat+"\n Absen"+Absen+"\n Telepon"+Telepon+"");
    }

     
    
}
