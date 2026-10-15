public class A1_Move extends World {

    public int randomXValue;
    public int randomYValue;
    public int randomBlue;
    public int randomRed;
    public int randomGreen;
    public void go() {

        randomBlue = plane.random(0, 225);
        randomRed = plane.random(0, 67);
        randomGreen = plane.random(0, 90);

        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        System.out.println("This message will be printed to the window below.");
        plane.pausetime =0;
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        plane.hasTrail = true;
        plane.move(100);
        plane.hasTrail = true;
        plane.move(100);
        plane.setAngle(3600);
        plane.move(300);
        plane.setAngle(270);
        plane.move(400);
        plane.setAngle(180);
        plane.move(300);
        plane.setAngle(315);
        plane.move(275);
        plane.setAngle(60);
        plane.move(230);

        bluetooth();
    }

        public void bluetooth(){

            randomBlue = plane.random(0, 255);
            randomXValue = plane.random(100, 700);
            randomYValue = plane.random(50, 500);
            randomRed = plane.random(0, 255);
            randomGreen = plane.random(0, 255);
            plane.hasTrail=true;
            plane.trailWidth = 10;
            plane.setTrailColor(randomRed, randomGreen, randomBlue);
            plane.teleport(randomXValue,randomYValue);
//mid line
            plane.teleport(500, 200);
            plane.setAngle(90);
            plane.move(320);

//1st triangle
            plane.teleport(500, 200);
            plane.setAngle(45);
            plane.move(115);
            plane.setAngle(135);
            plane.move(230);
//2nd triangle
            plane.teleport(420, 280);
            plane.setAngle(45);
            plane.move(230);
            plane.setAngle(135);
            plane.move(113);
            plane.teleport(500,375);
//circle and get rid of plane
            plane.circle(300);
            plane.teleport(0,0);
        }
    }


