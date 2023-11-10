/**
 * Represents the Sun in the solar system.
 */
public class Sun 
{
    double distance;
    double angle;
    double diameter; 
    String col; 

    /**
     * Constructs a Sun object with the specified parameters.
     *
     * @param distance The distance from the center of rotation (e.g., the center of the solar system).
     * @param angle    The initial angle in degrees.
     * @param diameter The diameter of the Sun.
     * @param col      The color of the Sun in hexadecimal or predefined color name.
     */
    public Sun(double distance, double angle, double diameter, String col) 
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;

    }
    /**
     * Draws the Sun in the given solar system.
     *
     * @param solarSystem The solar system where the Sun will be drawn.
     */
    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObject(distance, angle, diameter, col);
    }

}
