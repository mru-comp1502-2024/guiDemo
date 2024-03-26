package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Resume;

public class Controller {
    
    @FXML
    private Button addAchievementButton;

    @FXML
    private Button loadResumesButton;

    @FXML
    private Button removeResumeButton;

    @FXML
    private TextField newAchievementText;

    @FXML
    private ListView<Resume> resumesList;

    public void handleLoadResumesButton() {
        Resume r1 = new Resume("eric");
        r1.addAchievement("comp 1501");

        Resume r2 = new Resume("Khosro");
        r2.addAchievement("comp 1501");

        Resume r3 = new Resume("Apoorve");
        r3.addAchievement("comp 1502");
        r3.addAchievement("comp 1701");

        resumesList.getItems().add(r1);
        resumesList.getItems().add(r2);
        resumesList.getItems().add(r3);
        // resumesList.getItems().addAll(an_array_list) use this one to add a whole list of things    
    }
    
    public void initialize() {
        Resume r1 = new Resume("eric");
        r1.addAchievement("comp 1501");

        Resume r2 = new Resume("Khosro");
        r2.addAchievement("comp 1501");

        Resume r3 = new Resume("Apoorve");
        r3.addAchievement("comp 1502");
        r3.addAchievement("comp 1701");

        resumesList.getItems().add(r1);
        resumesList.getItems().add(r2);
        resumesList.getItems().add(r3);
    }

    public void removeResumeButtonHandler() {
        Resume selectedResume = resumesList.getSelectionModel().getSelectedItem();
        resumesList.getItems().remove(selectedResume);
    }

    public void addAchievementButtonHandler() {
        Resume selectedResume = resumesList.getSelectionModel().getSelectedItem();
        selectedResume.addAchievement(newAchievementText.getText());
        resumesList.refresh();
    }
}
