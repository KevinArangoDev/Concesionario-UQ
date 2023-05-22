package co.uniquindio.concesionario.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class LoginAdministradorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXTextField txtUsuarioAdmin;

    @FXML
    private JFXPasswordField txtContraseniaAdmin;

    @FXML
    private JFXButton brnVolverAdmin;

    @FXML
    private JFXButton btnIngresarAdmin;

    @FXML
    void ingresarVentAdmin(ActionEvent event) {

    }

    @FXML
    void volverVentPrincipal(ActionEvent event) {

    }



    @FXML
    void initialize() {

    }
}
