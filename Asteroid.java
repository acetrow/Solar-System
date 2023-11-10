/**
 * Represents an asteroid in the solar system, extending the Planet class.
 */
public class Asteroid extends Planet {

    /**
     * Constructs an Asteroid object with the specified parameters.
     *
     * @param distance                  The distance from the center of rotation.
     * @param angle                     The initial angle in degrees.
     * @param diameter                  The diameter of the asteroid.
     * @param col                       The color of the asteroid in hexadecimal or predefined color name.
     * @param centreOfRotationDistance  The distance from the center of rotation.
     * @param centreOfRotationAngle     The initial angle in degrees for the center of rotation.
     */
    public Asteroid(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle) 
    {
        super(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
    }

    /**
     * Draws the asteroid in the given solar system.
     *
     * @param solarSystem The solar system where the asteroid will be drawn.
     */
    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle = angle + 2;
    }
}
