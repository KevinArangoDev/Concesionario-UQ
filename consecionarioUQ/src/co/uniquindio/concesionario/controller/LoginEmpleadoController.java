package co.uniquindio.concesionario.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXButton brnVolver;

    @FXML
    private JFXButton btnIngresar;

    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXPasswordField txtContrasenia;


    @FXML
    void ingresarVentEmpleado(ActionEvent event) {

    }



    @FXML
    void volverVentPrincipal(ActionEvent event) {
    	try {
            // Cargar la interfaz FXML de la pantalla principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/principalView.fxml"));
            Parent root = loader.load();

            // Obtener el Stage principal
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Configurar la nueva escena en el Stage principal
            primaryStage.setScene(new Scene(root));

            // Mostrar el Stage principal
            primaryStage.show();

            // Opcional: cerrar la ventana actual (si es necesario)
//            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void initialize() {

    }
}

