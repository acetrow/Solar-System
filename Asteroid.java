public class Asteroid extends Planet 
{
    public Asteroid(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
    }
    
    public void draw(SolarSystem solarSystem) 
    {

        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle= angle+2;
 

    }
}