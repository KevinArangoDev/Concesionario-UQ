package co.uniquindio.concesionario.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.concesionario.exceptions.AdministradorException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginAdministradorController implements Initializable {

	ModelFactoryController singleton = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtIdAdmin;

    @FXML
    private TextField txtContraseniaAdmin;

    @FXML
    private Button btnIngresar;

    @FXML
    void ingresarVenAdmin(ActionEvent event) {
    	String idAdmin = this.txtIdAdmin.getText();
		String contrasenia = this.txtContraseniaAdmin.getText();

		if (singleton.inicioSesionAdmin(idAdmin ,contrasenia) == true) {

			try {
//				singleton.guardaRegistroLog("Usuario: " + idAdmin + " inicio sesion", 1, "LoginAnunciante");
				FXMLLoader loader = new FXMLLoader(
						getClass().getResource("../view/administradorView.fxml"));
				Parent root = loader.load();

				AdministradorController controlador = loader.getController();
				controlador.init();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setTitle("Menu Administrador");
//				stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/Logo Subasta.png")));
				stage.setScene(scene);
				stage.show();
				stage.setOnCloseRequest(e -> {
//					try {
////					controlador.btnMostrarVentanaPrincipal(event);
//					} catch (Exception e1) {
//						e1.printStackTrace();
//					}
				});
				Stage myStage = (Stage) this.btnIngresar.getScene().getWindow();
				myStage.close();

			} catch (IOException ex) {

				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText(ex.getMessage());
				alert.showAndWait();
			}
		} else {
//			singleton.guardaRegistroLog("Se intento iniciar sesion sin cuenta", 2, "LoginAnunciante");
//			Alert alert = new Alert(Alert.AlertType.ERROR);
//			alert.setHeaderText(null);
//			alert.setTitle("Notificacion");
//			alert.setContentText("Los datos no coinciden, vuelva a intentarlo.");
//			alert.showAndWait();
			try {
				throw new AdministradorException("Anunciante no existe");
			} catch (AdministradorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}


}
