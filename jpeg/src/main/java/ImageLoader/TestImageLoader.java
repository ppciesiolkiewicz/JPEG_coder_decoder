package ImageLoader;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TestImageLoader implements ImageLoaderInterface {

	public BufferedImage getImage() {
		BufferedImage img = null;

		try {
			img = ImageIO.read(new File("example_bmp/example1.bmp"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return img;
	}

}
