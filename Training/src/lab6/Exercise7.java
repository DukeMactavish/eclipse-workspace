package lab6;

import java.util.Arrays;
import java.util.Scanner;

    
public class Exercise7 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       
    	System.out.println("Enter the size of array:");
    	int size=sc.nextInt();
        Integer [] list= new Integer[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++) {
        	list[i]=sc.nextInt();
        }
        int status=getSorted(list);
        if(status==1) {
            for(Integer m: list) {
                System.out.println(m);
            }
        }else {
            System.out.println("Unable to sort");
        }
        
        


    }
   
    
    private static int getSorted(Integer[] list) {


        String [] reverseNumbers = new String[list.length];


        for(int i=0;i<list.length;i++) {
            reverseNumbers[i]= list[i].toString();
            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
            reverseNumbers[i]=sb.reverse().toString();
            list[i]= Integer.parseInt(reverseNumbers[i]);


        }       


        Arrays.sort(list);
        return 1;
    }


}













