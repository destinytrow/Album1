import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Album {

    public static void main(String[] args) {
        launchFX();
    }

    public static void launchFX() {
        new JFXPanel();
        Platform.runLater(() -> InitialiseGUI());
    }

    public static void InitialiseGUI() {
        Stage stage = new Stage();

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 720, 720);

        TableView tv = new TableView();
        TableColumn trackNumber = new TableColumn("Track Number");
        TableColumn song = new TableColumn("Song");
        TableColumn artist = new TableColumn("Artist");
        TableColumn duration = new TableColumn("Duration");
        tv.getColumns().addAll(trackNumber, song, artist, duration);
        borderPane.setCenter(tv);

        VBox boxOfButtons = new VBox(10);
        Button[] myButtons = new Button[1];

        myButtons[0] = new Button("Home");
        myButtons[0].setPrefSize(200, 50);
        myButtons[0].setOnAction((ActionEvent ae) -> System.out.println("ha"));

        boxOfButtons.getChildren().addAll(myButtons);
        borderPane.setLeft(boxOfButtons);

        stage.setScene(scene);
        stage.show();
    }
}
