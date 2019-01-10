import java.util.*;
/**
 * Veronica Pratt
 * 
 */
public class LabClass
{
    public static void main(){
        int nums [] = new int [20]; //creates array to work with
         for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        sortList(nums); //sorts array 
        listPrint(nums); //prints out sorted array check
    }
    public static int[] sortList(int list[]){
        for(int i = list.length; i>1; i--){ //allows for loops to check every value in array against every other value
            for(int j = 0; j<list.length-1; j++){ 
                if(list[j]>list[j+1]){ //compares every value to the next
                    int greater =  list[j];
                    list[j] = list[j+1];
                    list[j+1] = greater; //changes out values and sorts array
                }
            }
        }
        return list;
    }
    public static void listPrint(int list[]){
        for(int i = 0; i < list.length; i++){ //goes through every value in the array and prints it
            System.out.print(" " + list[i] + " ");
        }
    }
}