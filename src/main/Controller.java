package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML private TextField fullYear;
    @FXML private TextField rootFolder;



    public void runProgramThenClose() {


        main.Copy copy = new main.Copy(rootFolder.getText(), fullYear.getText());
        copy.mkDirs();
        copy.copyFiles();

        int fullYearInt = Integer.parseInt(fullYear.getText());
        main.Rename rename = new main.Rename(rootFolder.getText(), fullYearInt);
        rename.main();

    }
}
