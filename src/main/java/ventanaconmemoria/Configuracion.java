package ventanaconmemoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Configuracion {

	private String pathDirectorio;
	private String pathFichero;
	private DoubleProperty rojo;
	private DoubleProperty verde;
	private DoubleProperty azul;
	private DoubleProperty alto;
	private DoubleProperty ancho;
	private DoubleProperty x;
	private DoubleProperty y;
	
	public void GuardarInfo() throws FileNotFoundException, IOException {
		
		try(OutputStream document = new FileOutputStream(pathFichero)){
		Properties property = new Properties();
		
		property.setProperty("background.red", rojo.get()+" ");
		property.setProperty("background.green", verde.get()+" ");
		property.setProperty("background.blue", azul.get()+" ");
		property.setProperty("background.height", alto.get()+" ");
		property.setProperty("background.width", ancho.get()+" ");
		property.setProperty("background.x", x.get()+" ");
		property.setProperty("background.y", y.get()+" ");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public Configuracion() {
		
		pathDirectorio = System.getProperty("user.home")+ File.separator +".VentanaConMemoria";
		pathFichero = pathDirectorio + File.separator + "ventana.config";
		
		rojo = new SimpleDoubleProperty();
		verde =  new SimpleDoubleProperty();
		azul = new SimpleDoubleProperty();
		alto = new SimpleDoubleProperty();
		ancho = new SimpleDoubleProperty();
		x = new SimpleDoubleProperty();
		y = new SimpleDoubleProperty();
		
	}
	public final DoubleProperty rojoProperty() {
		return this.rojo;
	}
	
	public final double getRojo() {
		return this.rojoProperty().get();
	}
	
	public final void setRojo(final double rojo) {
		this.rojoProperty().set(rojo);
	}
	
	public final DoubleProperty verdeProperty() {
		return this.verde;
	}
	
	public final double getVerde() {
		return this.verdeProperty().get();
	}
	
	public final void setVerde(final double verde) {
		this.verdeProperty().set(verde);
	}
	
	public final DoubleProperty azulProperty() {
		return this.azul;
	}
	
	public final double getAzul() {
		return this.azulProperty().get();
	}
	
	public final void setAzul(final double azul) {
		this.azulProperty().set(azul);
	}
	
	public final DoubleProperty altoProperty() {
		return this.alto;
	}
	
	public final double getAlto() {
		return this.altoProperty().get();
	}
	
	public final void setAlto(final double alto) {
		this.altoProperty().set(alto);
	}
	
	public final DoubleProperty anchoProperty() {
		return this.ancho;
	}
	
	public final double getAncho() {
		return this.anchoProperty().get();
	}
	
	public final void setAncho(final double ancho) {
		this.anchoProperty().set(ancho);
	}
	
	public final DoubleProperty xProperty() {
		return this.x;
	}
	
	public final double getX() {
		return this.xProperty().get();
	}
	
	public final void setX(final double x) {
		this.xProperty().set(x);
	}
	
	public final DoubleProperty yProperty() {
		return this.y;
	}
	
	public final double getY() {
		return this.yProperty().get();
	}
	
	public final void setY(final double y) {
		this.yProperty().set(y);
	}
	
	
	

}
