# RoomCarpet
Starting out with objects exercise solutions
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Niilma M.
 */
public class RoomDimension {
    private double length;
    private double width;
    public RoomDimension(double len, double width)
        {
            this.length=len;
            this.width=width;
        }
    public RoomDimension(RoomDimension objCopy)
    {
        this.length= objCopy.length;
        this.width= objCopy.width;
    }
    public double getArea()
    {
        double area = length*width;
        return area;
    }
    public String toString()
    {
        String str = "Dimensions provided: \n "+ "Length : "+ length + "\n Width : "+ width;
        return str; 
    }
            
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Niilma M.
 */
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;
    public RoomCarpet(double cost, RoomDimension sizes)
        {
            //more secure
            this.carpetCost=cost;
            this.size= new RoomDimension(sizes);
            
        }
    public double getTotalCost()
    {
        double total=0.0;
        total = carpetCost * size.getArea();
        return total;   
    }
    public String toString()
    {
        String str = "The total cost is $"+ getTotalCost();
        return str;
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Niilma M.
 */
public class RoomDemo {
    public static void main(String[] args)
    {
        RoomDimension roomsize=new RoomDimension(12,12); 
        RoomCarpet a = new RoomCarpet(8, roomsize);
        System.out.println(a);
    }
    
}
