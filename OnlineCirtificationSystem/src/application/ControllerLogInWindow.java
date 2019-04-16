package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerLogInWindow {
	
	@FXML
	private TextField tF;
	
	@FXML
	private PasswordField psF;
	
	@FXML
	public void gotoUserWindow(ActionEvent event) throws IOException
    {
		String s1,s2;
		
		s1 = tF.getText().toString();
		s2 = psF.getText().toString();
		
		if (CheckUserLogIn(s1, s2))
		{

	    	Parent tableViewParent = FXMLLoader.load(getClass().getResource("UserWindow.fxml"));
	    	Scene tableViewScene = new Scene (tableViewParent);
	    	
	    	Stage window1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    	window1.setScene(tableViewScene);
	    	window1.show();
		}
		
		else System.out.println("Log in Failed .");
		
    }

	public boolean CheckUserLogIn (String s1, String s2)
	{
		boolean flag = false;
		
		return flag;
	}

}
