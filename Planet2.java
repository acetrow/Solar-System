/**
 * Represents a planet type 2 (faster speed of rotation) in the solar system, extending the Sun class.
 */
public class Planet2 extends Sun 
{
    double centreOfRotationDistance; 
    double centreOfRotationAngle;
     /**
     * Constructs a Planet2 object with the specified parameters.
     *
     * @param distance                  The distance from the center of rotation.
     * @param angle                     The initial angle in degrees.
     * @param diameter                  The diameter of the planet type 2.
     * @param col                       The color of the planet type 2 in hexadecimal or predefined color name.
     * @param centreOfRotationDistance  The distance from the center of rotation.
     * @param centreOfRotationAngle     The initial angle in degrees for the center of rotation.
     */
    public Planet2(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }
    /**
     * Draws the planet type 2 in the given solar system.
     *
     * @param solarSystem The solar system where the planet type 2 will be drawn.
     */
    public void draw(SolarSystem solarSystem) 
    {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle = angle + 2;

    }
}