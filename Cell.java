package Conway;


public class Cell {
	private boolean isAlive = false;
	private int column;
	private int row;

	/**
	 * Creates a dead Cell Object at the given coordinates
	 */
	public Cell(int row, int column) {
		this.column = column;
		this.row = row;
	}
	
	/**
	 * Creates either a living or dead Cell object.
	 * @param isAlive
	 */
	public Cell(int row, int column, boolean isAlive) {
		this.column = column;
		this.row = row;
		this.isAlive = isAlive;
	}
	
	// ******************Getters and Setters******************
	/**
	 * Kills Cell
	 */
	public void setDead() {
		this.isAlive = false;
	}
	
	/**
	 * Revives Cell
	 */
	public void setAlive() {
		this.isAlive = true;
	}
	
	/**
	 * Returns true if the Cell is alive and false otherwise.
	 * @return boolean
	 */
	public boolean getIsAlive() {
		return isAlive;
	}
	
	/**
	 * Returns coordinate of the Row
	 * @return int
	 */
	public int getRowCoordinate() {
		return row;
	}
	
	/**
	 * Return coordinate of the column
	 * @return int
	 */
	public int getColumnCoordinate() {
		return column;
	}
	
	/**
	 * Returns "#" if the Cell is alive and " " otherwise.
	 * @return String
	 */
	@Override
	public String toString() {
		if(isAlive == true) {
			return "#";
		}
		else return " ";
	}
}
