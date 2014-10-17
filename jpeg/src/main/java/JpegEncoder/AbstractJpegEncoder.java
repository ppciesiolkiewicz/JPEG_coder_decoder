package JpegEncoder;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import DataObjects.Tile;
import JpegMath.Coders.CodingInterface;
import JpegMath.Quantiziers.QuantizierInterface;
import JpegMath.Tilers.TilerInterface;

public abstract class AbstractJpegEncoder {
	int quality;

	public AbstractJpegEncoder(int quality_) {
		quality=quality_;
	}
	
	public BufferedImage encode(BufferedImage img) {
		Tile[][] tiles = preprocessing(img);
		transform(tiles);
		quantize(tiles);
		code(tiles);
		return img;
	}

	protected Tile[][] preprocessing(BufferedImage img) {
		Tile[][] tiles = tile(img);
		transformTileColor(tiles);
		return null;
	}
	
	protected void transformTileColor(Tile[][] tiles) {
		
	}

	protected Tile[][] tile(BufferedImage img) {
		TilerInterface tiler;
		return null;
	}

	protected abstract void transform(Tile[][] tiles);
	
	
	protected void quantize(Tile[][] tiles) {
		QuantizierInterface quant;
		
	}

	protected void code(Tile[][] tiles) {
		CodingInterface coder;
			
	}
	
	public void setQuality(int quality_) {
		quality = quality_;
	}
	
	public int getQuality() {
		return quality;	
	}
}