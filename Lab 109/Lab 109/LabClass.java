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
        mySort(nums); //sorts array in each one
        bubbleSort(nums);
        selectionSort(nums);
        listPrint(nums); //prints out sorted array as a check
    }
    public static int[] mySort(int list[]){
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
    public static int[] bubbleSort(int list[]){
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
    public static int[] selectionSort(int list[]){
        for(int i = list.length; i>0; i--){ //allows for loops to check every value in array against every other value
            int index = i;
            for(int j = i+1; j<list.length; j++){ 
                if(list[j]<list[index]){ //compares two values of array and switches the indeces of the two as needed
                    index = j;
                }
                int smallerNumber = list[index]; //finds the smaller value and sets it to a number
                list[index] = list[i]; //sets the smaller number to the lower index
                list[i] = smallerNumber;
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