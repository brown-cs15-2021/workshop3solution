package workshop3solution;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
    private BorderPane _root;

    public PaneOrganizer() {
        _root = new BorderPane();
        Pane cookiePane = new Pane();
        _root.setCenter(cookiePane);
        new Cookie(cookiePane);
    }
    public Pane getRoot() {
        return _root;
    }
}

