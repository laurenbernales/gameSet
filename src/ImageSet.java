import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageSet extends JPanel {
    private Image backgroundImage;

    public ImageSet() throws IOException {
        backgroundImage = ImageIO.read(new File("/home/scibor/Cooper/Software/gameSet/images/gameSetBackground.jpg"));
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(backgroundImage, 0, 0, this);
    }
}
