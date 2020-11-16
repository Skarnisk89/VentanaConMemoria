package ventanaconmemoria;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{
	
	public Controller() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/VentanaConMemoria.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	
	@FXML
    private GridPane view;

    @FXML
    private Slider rojo;

    @FXML
    private Slider verde;

    @FXML
    private Slider azul;
    
    Model color = new Model();
    
    public Model getModel() {
    	return color;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		rojo.valueProperty().bindBidirectional(color.rojoProperty());
		verde.valueProperty().bindBidirectional(color.verdeProperty());
		azul.valueProperty().bindBidirectional(color.azulProperty());
		
		color.colorProperty().addListener((o, ov, nv) -> {
			view.setStyle("-fx-background-color: rgb("+ nv.getRed()*256+","+nv.getGreen()*256+","+nv.getBlue()*256+");");
		});
		
	}
	
	public GridPane getView() {
		
		return view;
	}

}
