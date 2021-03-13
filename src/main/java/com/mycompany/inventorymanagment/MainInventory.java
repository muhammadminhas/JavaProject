
package com.mycompany.inventorymanagment;

import java.util.Scanner;

public class MainInventory {
    public static void main(String args[])
    {
       int choice;
       Scanner in=new Scanner(System.in);
    InventoryManagement obj=new InventoryManagement();
        
     do{
            System.out.println("--------------------GPU INVENTORY--------------------");
            System.out.println("+++MENU+++");
            System.out.println("1:Enter Item");
            System.out.println("2:Delete Item");
            System.out.println("3:Display Item");
           System.out.println("4:Exit");
           choice=in.nextInt();
           if(choice==1||choice==2||choice==3||choice==4)
           {
           if(choice==1)
           {
               System.out.println("Enter GPU Name which you want to enter:");
               String gpu=new Scanner(System.in).next();
               obj.add(gpu);
           }
           if(choice==2)
           {
               obj.remove();
           }
           if(choice==3)
           {
               obj.display();
           }
           }
           else
           {
               System.out.println("Wrong Number Entered");
           
           }
     }while(choice!=4);
       
    }
    }

