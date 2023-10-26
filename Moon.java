public class Moon extends Planet
{
    public Moon(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
    }

    public void draw(SolarSystem solarSystem) 
    {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle = angle + 2;
        centreOfRotationAngle++;
    }
}