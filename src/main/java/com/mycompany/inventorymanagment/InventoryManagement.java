
package com.mycompany.inventorymanagment;
import java.util.*;
public class InventoryManagement {
     int i=0;
    Scanner in= new Scanner(System.in);
     LinkedList<String> stock=new LinkedList<String>();
    public void add(String name){
       stock.add(name);
    }
    public void remove()
    {
        i=0;
        Iterator<String> iterator=stock.iterator();
     while(iterator.hasNext()){
        
       System.out.println((i)+":"+iterator.next());
      i=i+1;
     }
        System.out.println("Select The item number you want to delete");
        int x=in.nextInt();
        stock.remove(x);
    }
    public String display()
    {
        String n="";
         Iterator<String> iterator=stock.iterator();
        while(iterator.hasNext()){
       n+=iterator.next();
       n+="\n";
      
     }
        return n;
    }
} 
