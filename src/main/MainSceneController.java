package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainSceneController {

    @FXML private TextField fullYear;
    @FXML private TextField rootFolder;



    public void runProgramThenClose() {


        Copier copier = new Copier(rootFolder.getText(), fullYear.getText());
        copier.mkDirs();
        copier.copyFiles();

        int fullYearInt = Integer.parseInt(fullYear.getText());
        Renamer renamer = new Renamer(rootFolder.getText(), fullYearInt);
        renamer.main();

    }
}
