package Conway;

/**
 * Club Challenge for March 22, 2023
 *
 * Create Conway's Game of Life. This Challenge is more open-ended.
 *
 * Conway's Game of Life is a cellular automaton that is played on a 2D square grid. Each square (or "cell")
 * on the grid can be either alive or dead, and they evolve according to the following rules:
 *
 *     Any live cell with fewer than two live neighbours dies (referred to as underpopulation).
 *     Any live cell with more than three live neighbours dies (referred to as overpopulation).
 *     Any live cell with two or three live neighbours lives, unchanged, to the next generation.
 *     Any dead cell with exactly three live neighbours comes to life.
 *
 * Feel free to create or modify any of the starter code
 *
 * Find out more about conways game of life and test whether your implementation is working at conwaylife.com
 *
 * Extra Challenge: If you finish/have already done Conway's Game of Life before, look up Towers of Hanoi
 * and try implementing it using recursion.
 */
public class Grid {

    public Cell[][] grid;
    public int width;
    public int height;

    public Grid(int size) {

        width = size;
        height = size;
        grid = new Cell[size][size];

        //TODO Populate grid with random cells
    }

    public Cell[] getNeighbors(Cell cell) {
        //TODO this is just a suggestion and is optional to implement.
        return null;
    }

    public Cell getCellAtCords(int row, int column) {
        //TODO this is just a suggestion and is optional to implement.
        return null;
    }

    public void nextGeneration() {
        //TODO generate next generation
    }

    public void printGrid() {
        for(Cell[] c:grid) {
            for(Cell cell: c)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //TODO create and run grid
    }
}
