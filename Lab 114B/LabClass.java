import java.util.*;
/**
 * Veronica Pratt
 * 
 */
public class LabClass
{
    public static void mainMySort(){
        ArrayList <Integer> nums= new ArrayList <Integer> (); //creates arrayList to work with
         for(int i =0; i < 20; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums.add(random);
        }
        mySort(nums); //sorts array in each one
        listPrint(nums); //prints out sorted array as a check}
    }
    public static void mainBubbleSort(){
        ArrayList <Integer> nums= new ArrayList <Integer> (); //creates arrayList to work with
         for(int i =0; i < 20; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums.add(random);
        }
        bubbleSort(nums);
        listPrint(nums); //prints out sorted array as a check}
    }
        public static void mainSelectionSort(){
        ArrayList <Integer> nums= new ArrayList <Integer> (); //creates arrayList to work with
         for(int i =0; i < 20; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums.add(random);
        }
        selectionSort(nums);
        listPrint(nums); //prints out sorted array as a check}
    }
        public static void mainInsertionSort(){
        ArrayList <Integer> nums= new ArrayList <Integer> (); //creates arrayList to work with
         for(int i =0; i < 20; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums.add(random);
        }
        insertionSort(nums);
        listPrint(nums); //prints out sorted array as a check}
    }
    public static ArrayList mySort(ArrayList <Integer> list){
        long tStart = System.currentTimeMillis();
        int countCompare =0;
        int countSwap = 0;
        for(int i = list.size(); i>1; i--){ //allows for loops to check every value in array against every other value
            for(int j = 0; j<list.size()-1; j++){
                countCompare = countCompare +1;
                if(list.get(j)>list.get(j+1)){ //compares every value to the next
                    int greater =  list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, greater);//changes out values and sorts arrayList
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }
    public static ArrayList bubbleSort(ArrayList <Integer> list){
        long tStart = System.currentTimeMillis();
        int countCompare =0;
        int countSwap = 0;
        for(int i = list.size(); i>1; i--){ //allows for loops to check every value in array against every other value
            for(int j = 0; j<list.size()-1; j++){ 
                countCompare = countCompare +1;
                if(list.get(j)>list.get(j+1)){ //compares every value to the next
                    int greater =  list.get(j);
                    list.set(j, list.get(j+1)); 
                    list.set(j+1, greater);  //changes out values and sorts arrayList
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }
    public static ArrayList selectionSort(ArrayList <Integer> list){
        long tStart = System.currentTimeMillis();
        int countCompare =0;
        int countSwap = 0;
        for(int i = 0;i<list.size(); i++){ //allows for loops to check every value in arrayList against every other value
            int index = i;
            for(int j = i+1; j<list.size(); j++){ 
                countCompare = countCompare +1;
                if(list.get(j)<list.get(index)){ //compares two values of arrayList and switches the indeces of the two as needed
                    index = j;
                    countSwap = countSwap+1;
                }
                int smallerNumber = list.get(index); //finds the smaller value and sets it to a number
                list.set(index, list.get(i)); //sets the smaller number to the lower index
                list.set(i, smallerNumber);
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }
    public static ArrayList insertionSort(ArrayList <Integer> list){
        long tStart = System.currentTimeMillis();
        int countCompare =0;
        int countSwap = 0;
        for(int i = 1; i<list.size(); i++){ //allows for loops to check every value in arrayList against every other value
            for(int j = i; j>0; j--){ 
                countCompare = countCompare +1;
                if(list.get(j)<list.get(j-1)){ //compares two values of arrayList and switches the two as needed
                    int temp = list.get(j);
                    list.set(j, list.get(j-1));
                    list.set(j-1, temp);
                    countSwap = countSwap+1;
                }
            }
        }
        System.out.println(countCompare +", "+ countSwap);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }
    public static void listPrint(ArrayList <Integer> list){
        for(int i = 0; i < list.size(); i++){ //goes through every value in the array and prints it
            System.out.print(" " + list.get(i) + " ");
        }
    }
}  