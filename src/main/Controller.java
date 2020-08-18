package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;


public class Controller {

    @FXML private TextField fullYear;
    @FXML private TextField rootFolder;



    public void runProgramThenClose(javafx.event.ActionEvent actionEvent) throws IOException {


        // Make directories and copy files
        int fullYearInt = Integer.parseInt(fullYear.getText());
        main.Copy copy = new main.Copy(rootFolder.getText(), fullYearInt);
        copy.mkDirs();
        copy.copyFiles();

        // Rename files
        main.Rename rename = new main.Rename(rootFolder.getText(), fullYearInt);
        rename.main();


        // Switch scene to Done
        Parent view2 = FXMLLoader.load(getClass().getResource("done.fxml"));
        Scene scene2 = new Scene(view2);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();






    }
}
