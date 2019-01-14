/**
 * Veronica Pratt
 * 
 */
public class LabClass
{
    public static void mainmySort(){
        int nums [] = new int [20]; //creates array to work with
        for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        mySort(nums); //sorts array in each one
        listPrint(nums);}

    public static void mainBubbleSort(){
        int nums [] = new int [20]; //creates array to work with
        for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        bubbleSort(nums); //sorts array in each one
        listPrint(nums);}

    public static void mainSelectionSort(){
        int nums [] = new int [20]; //creates array to work with
        for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        selectionSort(nums);
        listPrint(nums);}

    public static void mainInsertionSort(){
        int nums [] = new int [20]; //creates array to work with
        for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        insertionSort(nums);
        listPrint(nums); //prints out sorted array as a check
    }

    public static int[] mySort(int list[]){
        int countCompare =0;
        int countSwap = 0;
        for(int i = list.length; i>1; i--){ //allows for loops to check every value in array against every other value
            for(int j = 0; j<list.length-1; j++){ 
                countCompare = countCompare +1;
                if(list[j]>list[j+1]){ //compares every value to the next
                    int greater =  list[j];
                    list[j] = list[j+1];
                    list[j+1] = greater; //changes out values and sorts array
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        return list;
    }

    public static int[] bubbleSort(int list[]){
        int countCompare =0;
        int countSwap = 0;
        for(int i = list.length; i>1; i--){ //allows for loops to check every value in array against every other value
            for(int j = 0; j<list.length-1; j++){ 
                countCompare = countCompare+1;
                if(list[j]>list[j+1]){ //compares every value to the next
                    int greater =  list[j];
                    list[j] = list[j+1];
                    list[j+1] = greater; //changes out values and sorts array
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        return list;
    }

    public static int[] selectionSort(int list[]){
        int countCompare =0;
        int countSwap = 0;
        for(int i = 0; i<list.length; i++){ //allows for loops to check every value in array against every other value
            int index = i;
            for(int j = i; j<list.length; j++){ 
                countCompare = countCompare+1;
                if(list[j]<list[index]){ //compares two values of array and switches the indeces of the two as needed
                    index = j;
                    countSwap = countSwap+1;
                }
                   int smallerNumber = list[index]; //finds the smaller value and sets it to a number
                   list[index] = list[i]; 
                   list[i] = smallerNumber;//sets the smaller number to the lower index
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        return list;
    }

    public static int[] insertionSort(int list[]){
        int countCompare =0;
        int countSwap = 0;
        for(int i = list.length-1; i>0; i--){ //allows for loops to check every value in array against every other value
            for(int j = i; j>0; j--){ 
                countCompare = countCompare+1;
                if(list[j]<list[j-1]){ //compares two values of array and switches the two as needed
                    int smaller = list[j];
                    list[j] = list[j-1];
                    list[j-1] = smaller;
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        return list;
    }

    public static void listPrint(int list[]){
        for(int i = 0; i < list.length; i++){ //goes through every value in the array and prints it
            System.out.print(" " + list[i] + " ");
        }
    }
}  