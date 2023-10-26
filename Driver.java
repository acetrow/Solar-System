public class Driver 
{
    public static void main(String[] args) 
    {
        SolarSystem solarSystem = new SolarSystem(1050, 1050);

        Sun sun_flare = new Sun(0, 0, 175, "#FDB813");
        Sun sun = new Sun(0, 0, 150, "#ff0000");
        
        Planet mercury = new Planet(115, 180, 15, "#966919", 0, 0);
        Planet2 venus = new Planet2(145, 315, 32, "#c9b037", 0 ,0);
        Planet earth = new Planet(201, 270, 35, "#465A3D", 0 ,0);
        Planet mars = new Planet(241, 45, 20, "#800000", 0 ,0);
        Planet2 jupiter = new Planet2(305, 135, 55, "#e3dccb", 0, 0);
        Planet2 saturn = new Planet2(359, 360, 40, "#b5651d", 0, 0);
        Planet uranus = new Planet(411, 90, 30, "#ADD8E6", 0, 0);
        Planet2 neptune = new Planet2(450, 225, 25, "#00008B", 0, 0);

        Moon earthMoon = new Moon(30, 270, 2, "GREY", earth.distance, earth.angle);
        Moon marsMoon1 = new Moon(20, 45, 2, "GREY", mars.distance, mars.angle);
        Moon marsMoon2 = new Moon(15, 225, 2, "GREY", mars.distance, mars.angle);

        Comet[] comets = new Comet[144];

        int k = 0;
        for (int i = 0; i < 72; i++) {
            comets[i] = new Comet(265, k, 1, "WHITE", 0, 0);
            k = k+5;
        }
        double j = 2.5;
        for (int i = 72; i < 144; i++) {
            comets[i] = new Comet(270, j, 1, "WHITE", 0, 0);
            j = j+5;
        }
        
        while (true) 
        {
            //sun 
            sun_flare.draw(solarSystem);
            sun.draw(solarSystem);
            
            //Planet 
            mercury.draw(solarSystem);
            venus.draw(solarSystem);
            earth.draw(solarSystem);
            mars.draw(solarSystem);
            jupiter.draw(solarSystem);
            saturn.draw(solarSystem);
            uranus.draw(solarSystem);
            neptune.draw(solarSystem);

            //Moon 
            earthMoon.draw(solarSystem);
            marsMoon1.draw(solarSystem);
            marsMoon2.draw(solarSystem);  

            //Comet
            for (int i = 0; i < 144; i++) 
            {
                comets[i].draw(solarSystem);
            }
            
            solarSystem.finishedDrawing();
        }
    }
}