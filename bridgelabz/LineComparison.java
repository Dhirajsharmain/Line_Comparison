//Welcome on line comparison Problem of Cartesian system
package bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        float x1, x2, y1, y2, a1, a2, b1, b2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a point x1:");
        x1 = scanner.nextFloat();
        System.out.println("Enter the value of a point y1:");
        y1 = scanner.nextFloat();
        System.out.println("Enter the value of a point x2:");
        x2 = scanner.nextFloat();
        System.out.println("Enter the value of a point y2:");
        y2 = scanner.nextFloat();
        System.out.println("Enter the value of a point a1:");
        a1 = scanner.nextFloat();
        System.out.println("Enter the value of a point b1:");
        b1 = scanner.nextFloat();
        System.out.println("Enter the value of a point a2:");
        a2 = scanner.nextFloat();
        System.out.println("Enter the value of a point b2:");
        b2 = scanner.nextFloat();
        float firstLineLength =(float) Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1,  2)));
        float secondLineLength =(float) Math.sqrt(Math.pow(a2-a1, 2) + (Math.pow(b2-b1, 2)));
        System.out.println("The length of a line is:" + firstLineLength);
        System.out.println("The length of a line is:" + secondLineLength);
    
        //Comparing using compareTo method
        Float obj1 = firstLineLength;
        Float obj2 = secondLineLength;
	    
        int comparevalue = Float.compare(obj1, obj2);
        
        if (comparevalue == 0){
	    	System.out.println("Both the line are equal.");
	    	}
        else if (comparevalue > 0){
        	System.out.println("The first line is greater than the second line.");
        	}
        else{
        	System.out.println("The second line is greater than first line.");
        	}
    }
}