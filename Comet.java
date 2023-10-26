public class Comet extends Planet 
{
    public Comet(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
    }
    
    public void draw(SolarSystem solarSystem) 
    {

        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle++;
 

    }
}