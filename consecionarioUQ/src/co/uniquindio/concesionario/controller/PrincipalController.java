package co.uniquindio.concesionario.controller;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



import com.jfoenix.controls.JFXButton;
import javax.xml.ws.Service.Mode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrincipalController  implements Initializable{
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnEmpleado;

    @FXML
    private JFXButton btnAdministrador;
    private Button btnEmpleado;

    @FXML
    private Button btnAdministrador;
    @Override
	public void initialize(URL location, ResourceBundle resources) {

	}

    @FXML
    void venLogAdmin(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/loginAdministradorView.fxml"));
    		Parent root = loader.load();

    		LoginAdministradorController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		Stage myStage = (Stage) this.btnAdministrador.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}


    }

    @FXML
    void venLogEmp(ActionEvent event) {

    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/loginEmpleadoView.fxml"));
    		Parent root = loader.load();

    		LoginEmpleadoController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnEmpleado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}


    }



}

