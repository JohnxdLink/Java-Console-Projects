package xxLinearRegression;
import java.util.*;
import java.lang.Math;

@SuppressWarnings("unused")
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String menu;
        double n, r, meanx, meany, lineargn;
        double sumx, sumy, xy1, xy2, xy3, xy4, xy5, xy6, xy7, sumxy, xsqrd1, xsqrd2, xsqrd3, xsqrd4, xsqrd5, xsqrd6, xsqrd7, sumxsqrd;
        double m, m1, m2, b, b1;
        double x1, x2, x3, x4, x5, x6, x7;
        double y1, y2, y3, y4, y5, y6, y7;
        double mse1, mse2, mse3, mse4, mse5, mse6, mse7;
        
        n = 7;
        
        // x
        x1 = 0;
        x2 = 0;
        x3 = 0;
        x4 = 0;
        x5 = 0;
        x6 = 0;
        x7 = 0;
        
        // y
        y1 = 0;
        y2 = 0;
        y3 = 0;
        y4 = 0;
        y5 = 0;
        y6 = 0;
        y7 = 0;
        do {
            System.out.println("-------| Regression Line Predictor |-------");
            System.out.println("[s] Start                          [e] Exit");
            System.out.println("-------------------------------------------");
            System.out.println("Input: ");
            menu = input.nextLine();
            if (menu.equals("s")) {
                
                // User Input Of X
                System.out.println("Enter X 1st Value: ");
                x1 = input.nextDouble();
                System.out.println("Enter X 2nd Value: ");
                x2 = input.nextDouble();
                System.out.println("Enter X 3rd Value: ");
                x3 = input.nextDouble();
                System.out.println("Enter X 4th Value: ");
                x4 = input.nextDouble();
                System.out.println("Enter X 5th Value: ");
                x5 = input.nextDouble();
                System.out.println("Enter X 6th Value: ");
                x6 = input.nextDouble();
                System.out.println("Enter X 7th Value: ");
                x7 = input.nextDouble();
                System.out.println("-------------------------------------------");
                
                // User Input Of Y
                System.out.println("Enter Y 1st Value: ");
                y1 = input.nextDouble();
                System.out.println("Enter Y 2nd Value: ");
                y2 = input.nextDouble();
                System.out.println("Enter Y 3rd Value: ");
                y3 = input.nextDouble();
                System.out.println("Enter Y 4th Value: ");
                y4 = input.nextDouble();
                System.out.println("Enter Y 5th Value: ");
                y5 = input.nextDouble();
                System.out.println("Enter Y 6th Value: ");
                y6 = input.nextDouble();
                System.out.println("Enter Y 7th Value: ");
                y7 = input.nextDouble();
                
                // Display X and Y
                System.out.println("-------------------------------------------");
                System.out.println("");
                System.out.println("X: " + x1 + "  " + x2 + "  " + x3 + "  " + x4 + "  " + x5 + "  " + x6 + "  " + x7);
                System.out.println("Y: " + y1 + "  " + y2 + "  " + y3 + "  " + y4 + "  " + y5 + "  " + y6 + "  " + y7);
                System.out.println("");
                System.out.println("-------------------------------------------");
                
                // Residual
                System.out.println("");
                System.out.println("Enter Random Residual:");
                r = input.nextDouble();
                System.out.println("");
                System.out.println("-------------------------------------------");
                
                // Sum Of X
                sumx = x1 + x2 + x3 + x4 + x5 + x6 + x7;
                
                // Sum Of Y
                sumy = y1 + y2 + y3 + y4 + y5 + y6 + y7;
                
                // xy
                xy1 = x1 * y1;
                xy2 = x2 * y2;
                xy3 = x3 * y3;
                xy4 = x4 * y4;
                xy5 = x5 * y5;
                xy6 = x6 * y6;
                xy7 = x7 * y7;
                
                // sumxy
                sumxy = xy1 + xy2 + xy3 + xy4 + xy5 + xy6 + xy7;
                
                // x^2
                xsqrd1 = x1 * x1;
                xsqrd2 = x2 * x2;
                xsqrd3 = x3 * x3;
                xsqrd4 = x4 * x4;
                xsqrd5 = x5 * x5;
                xsqrd6 = x6 * x6;
                xsqrd7 = x7 * x7;
                
                // sumxsqrd
                sumxsqrd = xsqrd1 + xsqrd2 + xsqrd3 + xsqrd4 + xsqrd5 + xsqrd6 + xsqrd7;
                
                // Meanx X and Y
                meanx = sumx / n;
                meany = sumy / n;
                
                // Linear Regression
                m1 = n * sumxy - sumx * sumy;
                m2 = n * sumxsqrd - sumx * sumx;
                m = m1 / m2;
                b1 = sumy - m * sumx;
                b = b1 / n;
                lineargn = m * r + b;
                System.out.println("");
                System.out.println("The Sum Of X: " + sumx);
                System.out.println("The Sum Of Y: " + sumy);
                System.out.println("The Sum Of XY: " + sumxy);
                System.out.println("The Sum Of X^2: " + sumxsqrd);
                System.out.println("The Mean Of X: " + meanx);
                System.out.println("The Mean Of Y: " + meany);
                System.out.println("The Slope(M): " + m);
                System.out.println("The Y-Intercept(B): " + b);
                System.out.println("The Linear Regression: " + lineargn);
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("");
                if (lineargn >= 101) {
                    System.out.println("Accuracy:   " + lineargn);
                    System.out.println("Status: Cannot Define Accuracy");
                    System.out.println("");
                    System.out.println("-------------------------------------------");
                } else {
                    if (lineargn >= 95 && lineargn <= 100) {
                        System.out.println("Accuracy:   " + lineargn);
                        System.out.println("Status: Outstanding Accuracy!");
                        System.out.println("");
                        System.out.println("-------------------------------------------");
                    } else {
                        if (lineargn >= 85 && lineargn <= 94) {
                            System.out.println("Accuracy:   " + lineargn);
                            System.out.println("Status: Very Satisfy Accuracy!!");
                            System.out.println("");
                            System.out.println("-------------------------------------------");
                        } else {
                            if (lineargn >= 80 && lineargn <= 84) {
                                System.out.println("Accuracy:   " + lineargn);
                                System.out.println("Status: Satisfy Accuracy!");
                                System.out.println("");
                                System.out.println("-------------------------------------------");
                            } else {
                                System.out.println("Accuracy:   " + lineargn);
                                System.out.println("Status: Good Accuracy!");
                                System.out.println("");
                                System.out.println("-------------------------------------------");
                            }
                        }
                    }
                }
                
                // Means Squared Error
                mse1 = (x1 - y1) * (x1 - y1) / n;
                mse2 = (x2 - y2) * (x2 - y2) / n;
                mse3 = (x3 - y3) * (x3 - y3) / n;
                mse4 = (x4 - y4) * (x4 - y4) / n;
                mse5 = (x5 - y5) * (x5 - y5) / n;
                mse6 = (x6 - y6) * (x6 - y6) / n;
                mse7 = (x7 - y7) * (x7 - y7) / n;
                System.out.println("");
                System.out.println("X: " + x1 + "  " + "Y: " + y1 + "  " + "MSE: " + mse1);
                System.out.println("X: " + x2 + "  " + "Y: " + y2 + "  " + "MSE: " + mse2);
                System.out.println("X: " + x3 + "  " + "Y: " + y3 + "  " + "MSE: " + mse3);
                System.out.println("X: " + x4 + "  " + "Y: " + y4 + "  " + "MSE: " + mse4);
                System.out.println("X: " + x5 + "  " + "Y: " + y5 + "  " + "MSE: " + mse5);
                System.out.println("X: " + x6 + "  " + "Y: " + y6 + "  " + "MSE: " + mse6);
                System.out.println("X: " + x7 + "  " + "Y: " + y7 + "  " + "MSE: " + mse7);
                System.out.println("");
                System.out.println("-------------------------------------------");
            } else {
                if (menu.equals("e")) {
                    
                    // Stop Program
                    System.out.println("-------------| Program Stop |--------------");
                    System.out.println("");
                    System.out.println("");
                } else {
                    
                    // Invalid Input
                    System.out.println("------------| Invalid Input |--------------");
                    System.out.println("");
                    System.out.println("");
                }
            }
        }
        while (!menu.equals("e"));
    }
}
