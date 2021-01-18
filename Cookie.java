package workshop3solution;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cookie {
    private Circle _cookieBase;
    private Circle _chocChip1;
    private Circle _chocChip2;
    private Circle _chocChip3;
    private Circle _chocChip4;

    // Cookie Constructor
    public Cookie(Pane alienPane) {
        // make cookie base
        this.makeCookieBase();

        // add chocolate chips (1-4)
        _chocChip1 = this.addChocChip(28,40);
        _chocChip2 = this.addChocChip(-40,8);
        _chocChip3 = this.addChocChip(12,-2);
        _chocChip4 = this.addChocChip(19,-34);
        _chocChip4 = this.addChocChip(-24,-35);

        //forget to add to pane and have students catch the mistake!
        alienPane.getChildren().addAll(_cookieBase, _chocChip1, _chocChip2, _chocChip3, _chocChip4);
    }

    private void makeCookieBase(){
        // Instantiate cookie base
        _cookieBase = new Circle();
        _cookieBase.setFill(Color.BURLYWOOD);
        _cookieBase.setCenterX(Constants.COOKIE_POSITION);
        _cookieBase.setCenterY(Constants.COOKIE_POSITION);
        _cookieBase.setRadius(Constants.COOKIE_RADIUS);
    }

    private Circle addChocChip(double x_pos, double y_pos){
            // Instantiate chocolate chip
            Circle myChocChip = new Circle();
            myChocChip.setFill(Color.ROSYBROWN);
            myChocChip.setCenterX(Constants.COOKIE_POSITION+x_pos);
            myChocChip.setCenterY(Constants.COOKIE_POSITION+y_pos);
            myChocChip.setRadius(Constants.CHOCO_CHIP_RADIUS);
            return myChocChip;
    }
}
