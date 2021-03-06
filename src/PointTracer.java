import java.util.Scanner;

/**
 * @version date  2018-08-29
 * @author Lasair Servilla
 */
public class PointTracer {
    /**
     * this creates several point tracers in a new window, one that makes a box,
     * one that makes a circle on a circle, and another fancy one.
     */
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.println("Please choose an option: \n (1) for box" +
                "\n (2) for circle on circle \n (3) for creative");
        int choice = select.nextInt();
        if (choice == 1) {
            box();
        } else if (choice == 2) {
            circleOnCircle();
        } else {
            creative();
        }
    }

    public static void box() {
        int pointSize = 10;
        int tracerLength = 400;
        int y;
        int x;

        // create display window for box tracer
        Display box = new Display(tracerLength, pointSize);

        while (true) {
            // tracer moves from right to left
            for (y = 0; y == 0; y++) {
                for (x = 0; x <= box.getWidth(); x++) {
                    box.drawNextPoint(x, y);
                }
            }
            // tracer moves from top to bottom
            for (x = box.getWidth(); x == box.getWidth(); x++) {
                for (y = 0; y <= box.getHeight(); y++) {
                    box.drawNextPoint(x, y);
                }

            }
            // tracer moves from left to right
            for (y = box.getHeight(); y == box.getHeight(); y++) {
                for (x = box.getWidth(); x >= 0; x--) {
                    box.drawNextPoint(x, y);
                }

            }
            // tracer moves from bottom to top
            for (x = 0; x == 0; x++) {
                for (y = box.getHeight(); y >= 0; y--) {
                    box.drawNextPoint(x, y);
                }

            }

        }
    }

    public static void circleOnCircle() {
        int pointSize = 5;
        int tracerLength = 400;
        double y;
        double x;
        double outY;
        double outX;

        // create new display panel
        Display circle = new Display(tracerLength, pointSize);

        // find center of the display
        int xc = circle.getWidth() / 2;
        int yc = circle.getHeight() / 2;

        // creating the inner, larger circle
        double angDI = 180;
        double angDO = 180;
        double radius = 150;
        double radiusOut = 25;

        while (true) {

            // creating inner circle
            double angR = Math.toRadians(angDI);
            x = xc + radius * Math.cos(angR); // finding x inner coordinate
            y = yc + radius * Math.sin(angR); // finding y inner coordinate
            circle.drawNextPoint((int) x, (int) y);
            angDI += 0.15;

            // creating outer circle
            double angRO = Math.toRadians(angDO);
            outX = x + radiusOut * Math.cos(angRO); // finding x outer
            outY = y + radiusOut * Math.sin(angRO); // finding y outer
            circle.drawNextPoint((int) outX, (int) outY);
            angDO += 3;

        }
    }

    public static void creative() {
        // note tha the display is 400 by 400
        // write out "HELLO"

        int pointSize = 10;
        int tracerLength = 4000;
        int y;
        int x;

        // create new display panel
        Display creative = new Display(tracerLength, pointSize);

        // making the letter "H"
        for (x = 25; x == 25; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 200; y == 200; y++) {
            for (x = 25; x <= 75; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (x = 75; x == 75; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        // making the letter "E"
        for (y = 150; y == 150; y++) {
            for (x = 100; x <= 150; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (x = 100; x == 100; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 200; y == 200; y++) {
            for (x = 100; x <= 150; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 250; y == 250; y++) {
            for (x = 100; x <= 150; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        // making the letter "L"
        for (x = 175; x == 175; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 250; y == 250; y++) {
            for (x = 175; x <= 225; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        // making the letter "L"
        for (y = 250; y == 250 ; y++) {
            for (x = 250; x <= 300; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (x = 250; x == 250; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        // making the letter "O"
        for (x = 325; x == 325; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (x = 375; x == 375; x++) {
            for (y = 150; y <= 250; y++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 150; y == 150 ; y++) {
            for (x = 325; x <= 375; x++) {
                creative.drawNextPoint(x, y);
            }
        }
        for (y = 250; y == 250 ; y++) {
            for (x = 325; x <= 375; x++) {
                creative.drawNextPoint(x, y);
            }
        }
    }
}
