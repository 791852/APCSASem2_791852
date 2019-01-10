import java.util.*;
/**
 * Veronica Pratt
 * 
 */
public class LabClass
{
    public static void main(){
        ArrayList<Integer> nums = new ArrayList();
         for(int i =0; i < nums.size(); i++){
            int random = (int)(Math.random()*11);
            nums.add(random);
        }
        listPrint(nums);
        sortList(nums);
        listPrint(nums);
    }
    public static ArrayList sortList(ArrayList<Integer> list){
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i+1)){
                list.set(i+1, list.get(i));
            }
        }
        return list;
    }
    public static void listPrint(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(" " + list.get(i) + " ");
        }
    }
}