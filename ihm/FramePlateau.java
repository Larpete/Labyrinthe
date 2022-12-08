package ihm;

import javax.swing.JFrame;

public class FramePlateau extends JFrame{

    private PanelPlateau panelPlateau;

    public FramePlateau(){

        this.panelPlateau = new PanelPlateau();
        this.add(panelPlateau);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}
