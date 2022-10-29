import java.util.*;
import java.text.NumberFormat;
import java.lang.Math.*;

public class Lab1 {

    public static void main(String args[])
    {
        // Create a Scanner to read from user input
        Scanner in = new Scanner(System.in);

        double radius = 0.0;
        while(radius < 10.0 || radius > 15.0)
        {
            System.out.print("Please enter the radius of the fountian (10.0 to 15.0 feet): ");
                radius = in.nextDouble();
            
            if(radius < 10.0 || radius > 15.0)
            {
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 10.0 and 15.0)");
            }   
        }
        
        double width1 = 0.0;
        while(width1 < 2.0 || width1 > 8.0)
        {
            System.out.print("Please enter the rectangular pedestal's x-axis width of the fountian (2.0 to 8.0 feet): ");
                width1 = in.nextDouble();
            
            if(width1 < 2.0 || width1 > 8.0)
            {
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0)");
            }
        }

        double width2 = 0.0;
        while(width2 < 2.0 || width2 > 8.0)
        {
            System.out.print("Please enter the rectangular pedestal's y-axis width of the fountian (2.0 to 8.0 feet): ");
                width2 = in.nextDouble(); 
        
            if(width2 < 2.0 || width2 > 8.0)
            {
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0)");
            }
        }
        
        double depth = 0.0;
        while(depth < 1.0 || depth > 3.0)
        {
            System.out.print("Please enter the water’s depth when full (1.0 to 3.0 feet): ");
                depth = in.nextDouble();
            
            if(depth < 1.0 || depth > 3.0)
            {
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 1.0 and 3.0)");
            }
        }
        
        double cylenderVolume = 0.0;
        double rectangleVolume = 0.0;
        double finalVolume = 0.0;
        
        cylenderVolume = (Math.pow(radius, 2) * Math.PI * depth);
        rectangleVolume = (width1 * width2 * depth);
        finalVolume = cylenderVolume - rectangleVolume;
        System.out.println("Water Volume in cubic feet: "+ finalVolume);
        
        double gallon = 0.0;
        gallon = (finalVolume * 7.481);         
        System.out.println("Water Volume in gallons: "+ gallon);
        
        double cost = 0.0;
        cost = (Math.ceil(gallon) *.1);         
        System.out.println("That amount of water will cost: " + NumberFormat.getCurrencyInstance().format(cost)); 
    }
}
