import java.util.*;
/**
 * Write a description of class Cell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cell
{
    private boolean occupied;
    private int id;
    private ArrayList<Cell> neighbors;
    public Cell(){
    }

    public void loadNeighbors(){
        for(int i=1; i < arr.length-1; i++){
            for(int j=1; j<arr[i].length-1; j++){
                if(arr[i-1][j] == null){
                    neighbors.add(arr[i-1][j]);
                }
                if(arr[i][j-1] == null){
                    neighbors.add(arr[i][j-1];
                }
                if(arr[i+1][j] == null){
                    neighbors.add(arr[i+1][j];
                }
                if(arr[i][j+1] == null){
                    neighbors.add(arr[i][j+1];
                }
            }
        }
    }
}