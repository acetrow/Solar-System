public class Planet extends Sun 
{
    double centreOfRotationDistance; 
    double centreOfRotationAngle;

    public Planet(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }
    
    public void draw(SolarSystem solarSystem) 
    {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle++;

    }
}