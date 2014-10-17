import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ImageLoader.TestImageLoader;
import ImageLoader.ImageLoaderInterface;


public class Main {
	static Application app;
	public static void main(String[] args) {
		app = new ConsoleApplication();
		app.run();
	}
	
}