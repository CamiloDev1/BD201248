package vistas;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelosDAO.Dueno;
import modelosDAO.DuenoDAO;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class VistaDueosController implements Initializable {
    @FXML
    private Button idNew;
    @FXML
    private Button idGuardar;
    @FXML
    private Button idEditar;
    @FXML
    private Button idEliminar;
    @FXML
    private TextField idNombre;
    @FXML
    private TextField idDireccion;
    @FXML
    private TextField idTelefono;

    @FXML
    private TableView<Dueno> tblListaDueños;

    @FXML
    private TableColumn<Dueno, String> clmnNombre;
    @FXML
    private TableColumn<Dueno, String> clmnDireccion;
    @FXML
    private TableColumn<Dueno, String> clmnTelefono;



    private ObservableList<Dueno> olListaDuenos;

private DuenoDAO duenoDAO;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*olListaDuenos = FXCollections.observableArrayList();
        try {
            duenoDAO = new DuenoDAO();
            olListaDuenos.addAll(duenoDAO.getAll());
            tblListaDueños.setItems(olListaDuenos);
            clmnNombre.setCellValueFactory(new PropertyValueFactory<Dueno, String>("Nombre"));
            clmnDireccion.setCellValueFactory(new PropertyValueFactory<Dueno, String>("Direccion"));
            clmnTelefono.setCellValueFactory(new PropertyValueFactory<Dueno, String>("Telefono"));
            gestionDeEventos();
        } catch (SQLException e) {
            System.err.println("Error en algo que no se");
            System.err.println(e.getMessage());
        }*/


    }
    @FXML
    public void BtnGuardar(Event event){
        DuenoDAO dao = new DuenoDAO();

        dao.GuardarDatos(idNombre.getText(), idDireccion.getText(), idTelefono.getText());
    }



    public void gestionDeEventos() {


        tblListaDueños.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Dueno>() {

            @Override
            public void changed(ObservableValue<? extends Dueno> observableValue, Dueno valorAnterior, Dueno valorNuevo) {

            }
        });
    }



}

