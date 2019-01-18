
/**
 * Veronica Pratt
 * 
 */
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
            nums[i] = random;
        }
        insertionSort(nums);
        listPrint(nums); //prints out sorted array as a check
    }

    public static void mainMergeSort(){
        long tStart = System.currentTimeMillis();
        int nums [] = new int [20]; //creates array to work with
        for(int i =0; i < nums.length; i++){ //fills array with random numbers
            int random = (int)(Math.random()*11);
            nums[i] =random;
        }
        mergeSort(nums, 20);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        listPrint(nums); //prints out sorted array as a check
    }

    public static int[] mySort(int list[]){
        long tStart = System.currentTimeMillis();
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
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }

    public static int[] bubbleSort(int list[]){
        long tStart = System.currentTimeMillis();
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
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }

    public static int[] selectionSort(int list[]){
        long tStart = System.currentTimeMillis();
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
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        System.out.println(tDelta);
        return list;
    }

    public static int[] insertionSort(int list[]){
        long tStart = System.currentTimeMillis();
        int countCompare =0;
        int countSwap = 0;
        int smaller = 0;
        for(int i = 1; i<list.length; i++){ //allows for loops to check every value in array against every other value
            for(int j = i; j>0; j--){ 
                countCompare = countCompare+1;
                if(list[j]<list[j-1]){ //compares two values of array and switches the two as needed
                    smaller = list[j];
                    list[j] = list[j-1];
                    list[j-1] = smaller;
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

    public static void mergeSort(int [] list, int n){
        if(n<2){
            return; //cuts off method once the arrays are too small to split up anymore
        }
        int mid = n/2;
        int [] l = new int [mid]; ///splits up array into 2 even parts
        int [] r = new int [n-mid];
        for(int i =0; i<mid; i++){
            l[i] = list[i]; //loads new array with values from first half of original array
        }
        for(int i = mid; i<n; i++){
            r[i-mid] = list[i]; //loads new array with values from second half of original array
        }
        mergeSort(l, mid); //uses recursion to keep splitting up array into smaller and smaller parts
        mergeSort(r, n-mid);
        merge(list, l, r, mid, n-mid); //now this actually merges the arrays together, sorting them as it goes
    }

    public static void merge(int[] list, int[] l, int[] r, int left, int right) {
        int countCompare =0;
        int countSwap = 0;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) { //makes sure values are less than the upper limits of the two arrays
            countCompare +=1;
            if (l[i] <= r[j]) { //puts the smaller value (checking to see if it's from the left array or the right array) into the lower position)
                list[k++] = l[i++];
                countSwap +=1;
            }else {
                list[k++] = r[j++]; 
                countSwap+=1;
            }
        }
        while (i < left) { 
            list[k++] = l[i++]; //goes through both arrays and puts all the values into the main array
        }
        while (j < right) {
            list[k++] = r[j++];
        }
        System.out.println(countCompare + countSwap);
    }

    public static void listPrint(int list[]){
        for(int i = 0; i < list.length; i++){ //goes through every value in the array and prints it
            System.out.print(" " + list[i] + " ");
        }
    }
}  