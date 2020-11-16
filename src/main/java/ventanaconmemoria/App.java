package ventanaconmemoria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
		
		Controller controller;
		Configuracion config = new Configuracion();
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		controller.getModel().rojoProperty().bindBidirectional(config.rojoProperty());
		controller.getModel().azulProperty().bindBidirectional(config.azulProperty());
		controller.getModel().verdeProperty().bindBidirectional(config.verdeProperty());
		
		config.xProperty().bind(primaryStage.xProperty());
		config.yProperty().bind(primaryStage.yProperty());
		
		primaryStage.setX(config.getX());
		primaryStage.setY(config.getY());
		
		Scene scene = new Scene(controller.getView(), config.getAncho(), config.getAlto());
		
		config.anchoProperty().bind(scene.widthProperty());
		config.altoProperty().bind(scene.heightProperty());
		
		
		primaryStage.setTitle("Ventana con Memoria");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
