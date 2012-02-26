/*
 * created : Jul 10, 2011
 * by : Latief
 */
package sample.jtree.example.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Latief
 */
public class JPPanel extends JPanel {

    private Icon icon;
    private float alphaTransparency;

    public JPPanel() {
        super();
       // icon = new ImageIcon(getClass().getResource("/com/secondstack/swing/image/backgroundpanel.jpg"));
        alphaTransparency = 1f;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();

        Color colorTransparency = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), (int) (255 * alphaTransparency));
        g2d.setColor(colorTransparency);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        if (icon != null) {

            Point p = new Point();
            Dimension d = new Dimension();
            p.setLocation(0, 0);
            d.setSize(getWidth(), getHeight());
            Rectangle bounds = new Rectangle(p, d);

            g2d.setComposite(AlphaComposite.SrcOver.derive(alphaTransparency));
            g2d.drawImage(((ImageIcon) icon).getImage(), bounds.x, bounds.y, bounds.width, bounds.height, null);
        }
        g2d.dispose();
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public float getAlphaTransparency() {
        return alphaTransparency;
    }

    public void setAlphaTransparency(float alphaTransparency) {
        this.alphaTransparency = alphaTransparency;
    }
}
