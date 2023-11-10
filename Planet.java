/**
 * Represents a planet in the solar system, extending the Sun class.
 */
public class Planet extends Sun 
{
    double centreOfRotationDistance; 
    double centreOfRotationAngle;

    /**
     * Constructs a Planet object with the specified parameters.
     *
     * @param distance                  The distance from the center of rotation.
     * @param angle                     The initial angle in degrees.
     * @param diameter                  The diameter of the planet.
     * @param col                       The color of the planet in hexadecimal or predefined color name.
     * @param centreOfRotationDistance  The distance from the center of rotation.
     * @param centreOfRotationAngle     The initial angle in degrees for the center of rotation.
     */
    public Planet(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }
    /**
     * Draws the planet in the given solar system.
     *
     * @param solarSystem The solar system where the planet will be drawn.
     */
    public void draw(SolarSystem solarSystem) 
    {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle++;

    }
}