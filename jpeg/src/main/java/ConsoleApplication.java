import java.awt.image.BufferedImage;
import java.io.File;

import ArgParser.ArgInfo;
import Factories.AbstractJpegEncoderDecoderFactory;
import Factories.Jpeg2000EncoderDecoderFactory;
import Factories.JpegEncoderDecoderFactory;
import ImageLoader.SimpleImageLoader;
import ImageLoader.ImageLoaderInterface;
import JpegInterfaces.DecoderInterface;
import JpegInterfaces.EncoderInterface;

public class ConsoleApplication implements Application {
	private AbstractJpegEncoderDecoderFactory jpegAlgorithmFactory;

	public void run() {
		
	}

	public void run(ArgInfo info) {
		AbstractJpegEncoderDecoderFactory factory = null;
		if( info.isJpeg() ) {
			factory = new JpegEncoderDecoderFactory(info);
		}
		else if( info.isJpeg2000() ) {
			factory = new Jpeg2000EncoderDecoderFactory(info);
		}
		
		if( info.doEncode() ) {
			EncoderInterface enc = factory.getEncoder();
			enc.encode();
		}
		else {
			DecoderInterface dec = factory.getDecoder();
			dec.decode();
		}
	}

}
