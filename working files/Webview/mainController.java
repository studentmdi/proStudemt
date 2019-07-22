package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class mainController implements Initializable {
	
	@FXML
    private WebView webView;
    @FXML
    private WebEngine engine;
	@Override
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		 engine = webView.getEngine();			
	}
	 public void button1(ActionEvent e){

	engine.load("https://www.yahoo.com");
 }
	  public void button2(ActionEvent e){
		  
	   engine.executeScript("window.location =\"http://w3school.com//\";");
  }
	   public void button3(ActionEvent e){
	  
       engine.loadContent("<html>"
       		+ "<h1>LaminJatta.com</h1> "
       		+ "</html>");
   }
    public void button4(ActionEvent e){
     engine.reload();
  }


}
