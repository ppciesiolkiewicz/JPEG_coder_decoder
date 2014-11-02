package JpegMath.Tilers;

import java.lang.reflect.Array;

import DataObjects.Tile;


//consider non-divisible by 8 arrays
public class JpegTiler implements TilerInterface<Integer> {
	final int tileSize = 8;
	

	public Tile<Integer>[][] tile(Integer[][] pixelMatrix) {
		Integer amountY = (int) Math.ceil(pixelMatrix.length/(double) tileSize);
		Integer amountX = (int) Math.ceil(pixelMatrix[0].length/(double) tileSize);
		
		@SuppressWarnings("unchecked")
		Tile<Integer>[][] tiles = (Tile<Integer>[][]) Array.newInstance(Tile.class, amountY, amountX);
		
		for(int y = 0; y < pixelMatrix.length; y++) {
			for(int x = 0; x < pixelMatrix[0].length; x++) {
				if(x % tileSize == 0 && y % tileSize == 0)
					tiles[y/8][x/8] = new Tile<Integer>(Integer.class, tileSize, tileSize);
				if(y < pixelMatrix.length && x < pixelMatrix[0].length)
					tiles[y/8][x/8].setVal(x%tileSize, y%tileSize, pixelMatrix[y][x]);
			}
		}

		//TODO copy values if sizeX, sizeY % 8 != 0..
		return tiles;
	}

	public Integer[][] connect(Tile<Integer>[][] tiles) {
		// TODO Auto-generated method stub
		return null;
	}

}
