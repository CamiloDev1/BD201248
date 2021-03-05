package vistas;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;

public class MenuPrincipalController {
    @FXML
    private Button btnDueños;
    @FXML
    private Button btnMascotas;
    @FXML
    private Button btnCitas;
    @FXML
    private Button btnMedicamentos;

    @FXML
    public void vistaDuenos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VistaDueos.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(page));
            stage.setTitle("Dueños");
            stage.show();
        } catch (IOException e) {
            System.out.println("Llege hasta aqui y no se como");
            e.printStackTrace();
        }
    }



    @FXML
    public void vistaMascotas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mascotas.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(page));
            stage.setTitle("Mascotas");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @FXML
    public void vistaMedicamentos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Medicamentos.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(page));
            stage.setTitle("Medicamentos");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
