package DataObjects;

public interface Tile {
	public Number getVal(int x, int y);
	
	public void setVal(int x, int y, Number newVal);
	
	public Number[][] getValues();
}
