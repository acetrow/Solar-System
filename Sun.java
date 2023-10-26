public class Sun 
{
    double distance;
    double angle;
    double diameter; 
    String col; 

    public Sun(double distance, double angle, double diameter, String col) 
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;

    }

    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObject(distance, angle, diameter, col);
    }

}
