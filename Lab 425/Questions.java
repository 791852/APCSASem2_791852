import java.util.*;
public class Questions
{
    // Question 1
    public Integer findMissing(ArrayList<Integer> arr1){
        int missing = 0;
        for(int i = arr1.size(); i>1; i--){ //this sorts the array with bubble sort
            for(int j=0; j < arr1.size()-1; j++){
                if(arr1.get(j)> arr1.get(j+1)){
                    int greater = arr1.get(j);
                    arr1.set(j, arr1.get(j+1));
                    arr1.set(j+1, greater);
                }
            }
        }
        for(int k =0; k<arr1.size()-1; k++){ //search the array for the point at which the sorted array skips a number
            if(arr1.get(k) +1 != arr1.get(k+1)){
                missing = arr1.get(k)+1; //setting the return number to the value the sorted array skips
            }
        }
        return missing; //returning the missing value
    }
    // Question 2
    public int findSum(int[] a1, int[] a2, int targ){
        int sum = 0;
        for(int i =0; i < a1.length; i++){ //these nested for loops go through each array
            for(int j = 0; j<a2.length; j++){
                if(targ - (a1[i]+a2[j]) < targ - sum){ //checks each sum to see if it is closer than the current sum
                    sum = a1[i]+a2[j]; //resets the sum to the closer one
                }
            }
        }
        return sum; //returns the sum
    }
    //Question 3
    public String findFirstRepeating(String str)
    {
        String repeat = ""; //creating the empty string to return if there are no repeats
        for(int i=0; i<str.length()-1; i++){
                if(str.indexOf(str.substring(i, i+1), i+1)!=-1){ //checking through the array to see if a character repeats
                    repeat = str.substring(i, i+1); //setting the repeat string to the repeating character
                    return repeat; //returning it immediately so that the method returns the first repeated character
                }
        }
        return repeat; //returns the empty string should a repeating character not be found
    }
    //Question 4
    public ArrayList<Integer> findIntersection(int[]a1, int[]a2, int[]a3){
        ArrayList<Integer> intersect = new ArrayList<Integer>(); //creates the arraylist to return
        for(int i=0; i<a1.length; i++){
            if(Arrays.binarySearch(a2, 0, a2.length, a1[i]) != -1 && Arrays.binarySearch(a3, 0, a3.length, a1[i]) != -1){
                //using binarySearch array method to find if both arrays have the value at the current index in the first array
                intersect.add(a1[i]); //if it exists, adds that value to the arraylist
            }
        }
        return intersect; //returns the arraylist
    }
    //Question 5
    public int[][] flipDiagonal(int[][] mat){
        int[][] flipped = new int[mat.length][mat.length]; //creating new 2D array of proper length
        for(int i =0; i<mat.length; i++){ //nested for loops go through all of the values in the original array
            for(int j=0; j<mat.length; j++){
                flipped[i][j] = mat[j][i]; //sets the new array to the corresponding diagonal element in the input array
            }
        }
        return flipped; //returning the flipped array
    }
}
