import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    
    private static final String FXML_FILE = "GUI.fxml";
    private static final String WINDOW_TITLE = "Hello World!";

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = loadFXML();
            Scene scene = new Scene(root);
            primaryStage.setTitle(WINDOW_TITLE);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace for debugging
            // Optionally, you could show an alert dialog here
        }
    }

    private Parent loadFXML() throws IOException {
        return FXMLLoader.load(getClass().getResource(FXML_FILE));
    }

    public static void main(String[] args) {
        launch(args);
    }
}