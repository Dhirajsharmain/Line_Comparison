//Welcome on line comparison Problem of cartesian system
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
        System.out.println("(x1,y1)=" +x1+"," +y1 + " (x2,y2)="+x2+","+y2 + " (a1,b1)=" +a1+","+b1 + " (a2,b2)="+a2+","+b2);
    }
}