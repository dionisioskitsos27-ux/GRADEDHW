public class A7_BasicLoop extends World {
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public int randomx;
    public int randomy;

    public void go() {
        plane.hasTrail = true;
        plane.pausetime = 1;
        plane.trailWidth = 30;

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

                plane.teleport( 100 * x,y *100);
                plane.setTrailColor(10 + 20 * y, x*20, 0);
                square1();

            }//end of inner for
        }//end of outer for

//        for (int x = 2; x < 12; x = x + 2) {
//            randomBlue = plane.random(0, 225);
//            randomRed = plane.random(0, 100);
//            randomGreen = plane.random(0, 90);
//            plane.setTrailColor(randomBlue, randomGreen, randomRed);
//
//            plane.teleport(x * 100, 100);
//            plane.setTrailColor(10 + 50 , 0, 0);
//        }
    }

    public void square1() {
    // todo:make a loop that loops 4 times

        for (int y = 0; y < 4; y++) {

            //todo: draw a square only using 2 lines of code
            plane.move(50);
            plane.turnLeft(90);

        }


    }// end of square
}// end of file