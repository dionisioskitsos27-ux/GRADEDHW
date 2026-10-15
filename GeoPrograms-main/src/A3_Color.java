public class A3_Color extends World {

    //variables;
    public int randomBlue;
    public int randomGreen;
    public int randomRed;
    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.trailWidth = 100;

        //ad value to the variable
        randomBlue = plane.random(0, 225);
        randomRed = plane.random(0,67);
        randomGreen = plane.random(0,90);
        plane.setTrailColor(randomRed,randomGreen, randomBlue);
        plane.move(100);
        square();
    } //end of go


    public void square(){
        randomBlue = plane.random(0, 67);
        randomRed = plane.random(0,10);
        randomGreen = plane.random(0,290);
        plane.hasTrail = true;
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);

    }  //end of square

}//end of file
