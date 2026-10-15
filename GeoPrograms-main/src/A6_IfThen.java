public class A6_IfThen extends World {


    public int randNum;
    public int randomXValue;
    public int randomYValue;
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public void go() {

        randomBlue = plane.random(0, 225);
        randomRed = plane.random(0, 100);
        randomGreen = plane.random(0, 90);
        randomXValue = plane.random(100,175);
        randomYValue = plane.random(70,185);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.hasTrail = true;
        plane.pausetime = 2;
        plane.teleport(randomXValue, randomYValue);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if (randNum == 3) {
            square ();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    } // end of rectangle

    // add a method to the file, copy and paste or make annew one.
    public void rect() {
        plane.hasTrail = true;
        plane.pausetime = 2;
        plane.teleport(150, 200);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(500, 800);
        }
        if (randNum == 2) {
            rectangle(70, 800);
        }

    }  // end of file
}



