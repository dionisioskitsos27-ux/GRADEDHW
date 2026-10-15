public class GHImage extends World {
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomx;
    public int randNum;
// Ms Blair helped me on a lot of this code
    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 60;
        plane.setTrailColor(0,100,0);
        plane.teleport(744,215);
        plane.fillCircle(150);
        // the code for the head of the turtle
        plane.teleport(774,267);
        plane.setTrailColor(0,0,0);
        // \\
        // this is the mouth
        randNum = plane.random(0, 3);
        if (randNum == 0) {
            plane.fillCircle(40);
        }

        if (randNum == 2) {
            plane.circle(40);
        }
// decides when the mouth is a smiley or frown or no mouth at all
        plane.trailWidth = 80;
        plane.teleport(723,268);
        plane.setTrailColor(0, 100, 0);
        square1();
        plane.teleport(705,148);
        plane.setTrailColor(0,0,0);
        plane.fillCircle(20);
        plane.teleport(805,148);
        plane.setTrailColor(0,0,0);
        plane.fillCircle(20);
        plane.teleport(125,532);
        // codimg for the eyes of circles filled with black
        plane.trailWidth = 40;
        plane.setTrailColor(0, 100,0);
        plane.setAngle(270);
        plane.move(100);
        plane.teleport(435,532);
        plane.trailWidth = 40;
        plane.setTrailColor(0, 100,0);
        plane.setAngle(270);
        plane.move(100);
        // these are the legs
        plane.teleport(588,216);
        plane.setAngle(0);
        plane.move(20);
        plane.teleport(0, 569);
        plane.setTrailColor(50,0,0);
        plane.move(700);
        plane.teleport(547, 600);
        plane.setAngle(30);
        plane.move(100);
        // the brown branch code






        for(int y=0; y<10; y++) {
            for (int x = 1; x < 12; x = x + 1) {
                randomBlue = plane.random(0, 20);
                randomRed = plane.random(0, 70);
                randomGreen = plane.random(0, 90);
                // plane.setTrailColor(randomBlue, randomGreen, randomRed);
                //first part is variable decleration
                //second part is if statement, and is also called conditional. also our question
                // make a row of squares using teleport
                // call this our increment, happens last, goes until 5 and then stops

                plane.teleport( 50 * x,y *50);
                plane.setTrailColor(50, x+y*20 +60, 50);
            plane.trailWidth = 50;
                square1();

            }//end of inner for
        }//end of outer for


//
//        }
    }

    public void square1() {
        // todo:make a loop that loops 4 times

        for (int y = 0; y < 4; y++) {

            //todo: draw a square only using 2 lines of code
            plane.move(10);
            plane.turnLeft(90);
            // these are for the squares on the shelll tellling them to go up and down

        }


    }// end of square
}// end of file