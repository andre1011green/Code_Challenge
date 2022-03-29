/*
file: Toggle.java
author: Andre Long
date: 3/28/2022
description: 100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers. Next, he closes every second locker. 
Then, on his third pass, he toggles every third locker (closes it if it is open or opens it if it is closed). This process continues for 100 passes, 
such that on each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway, in which he toggles only locker #100, how many lockers are open? 
*/
import java.util.*;


public class Toggle
{
   public static void toggleLockers(int[] x)
   {
      int divisor = 2;
      int indexOfElement;
      for(int q = 0; q < x.length; q++)
      {    
         for(int i = 0; i < x.length;  i++)
         {
               indexOfElement = i; //i is the index of the array
               
               if( (indexOfElement % divisor) == 0)
               {
                  //System.out.println("Match 0 at i = " + i);
                  if(x[i] == 0)
                  {
                     x[i] = 1;
                  }
                  else
                  {
                     x[i] = 0;
                  }
               }
            
         }//end inner for loop
         divisor++;
      }//end outter for loop
   }
   
   public static int countOpenLockers(int[] y)
   {
      int countOpenLockers = 0;
      for(int w = 0; w < y.length; w++)
      {
         if(y[w] == 0)
         { countOpenLockers++; }
      }
      return countOpenLockers;
   }
   
   public static void main(String[] arg)
   {
      int[] lockers = new int[100];
      Arrays.fill(lockers, 0); // 0's are opem lockers
      int numberOfOpenLockers;
      
      Toggle.toggleLockers(lockers);
      for(int f = 0; f < lockers.length; f++)
      {
         System.out.print(lockers[f] + " ");
      }
      
      numberOfOpenLockers = Toggle.countOpenLockers(lockers);
      System.out.print("\n Number Of Open Lockers = " + numberOfOpenLockers );
   }
}

