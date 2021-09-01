package workshop3solution;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
    private BorderPane root;

    public PaneOrganizer() {
        this.root = new BorderPane();
        Pane cookiePane = new Pane();
        this.root.setCenter(cookiePane);
        new Cookie(cookiePane);
    }
    public Pane getRoot() {
        return this.root;
    }
}

