public class A5_Square extends World {

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 3;
        plane.setTrailColor(100, 10, 200);

        plane.setAngle(90);
        square(100);
        plane.teleport( 200, 200);
        bigSquare();
        square(300);
        bigSquare();
        square(400);
        bigSquare();
        square(600);

    }

    //parameter type of variable that live in the parethensisis inside method
    // can only be used in the method
    // boolean, integer
    public void square(int size) {
        plane.setAngle(90);
        plane.hasTrail = true;
        //boolean
        plane.trailWidth = 10;
        plane.move(size);
        // 2 variables
        // 2 dtata types stores inside the varibale
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.setAngle(90);

        // notice the direction your plane is facing at this point
    }


    //todo:make another method called bigSquare that makes a square that is big

    public void bigSquare() {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(211);
        plane.turnLeft(90);
        plane.move(211);
        plane.turnLeft(90);
        plane.move(211);
        plane.turnLeft(90);
        plane.move(211);
        plane.setAngle(90);
    }


    }



