public class Driver
{
    public static void main(String[] args) 
    {
        SolarSystem a = new SolarSystem(1700, 1050);

        //angle of rotation of planets 
        int mercury = 180;
        int venus = 315;
        int earth = 270;
        int mars = 45;
        int jupiter = 135;
        int saturn = 360;
        int uranus = 90;
        int neptune = 225;
        
        //angle of rotation of planets' moons 
        int earth_moon = 270;
        int mars_moon = 45;
        int mars_moon2 = 225;
        int jupiter_moon = 135;
        int saturn_moon = 360;
        int uranus_moon = 90;
        int neptune_moon = 225;
        
        while (true)
        {
            //sun's flare
            a.drawSolarObject(0, 0, 175, "#FDB813");
            //sun
            a.drawSolarObject(0, 0, 150, "#ff0000");

            //mercury
            a.drawSolarObjectAbout(125, mercury, 15, "#966919", 0, 0);
            mercury = mercury + 2;

            //venus
            a.drawSolarObjectAbout(183, venus, 37, "#c9b037", 0, 0);
            venus = venus + 2;

            //earth
            a.drawSolarObjectAbout(251, earth, 40, "#465A3D", 0, 0);
            earth++;

            //mars
            a.drawSolarObjectAbout(321, mars, 25, "#800000", 0, 0);
            mars++;

            //jupiter
            a.drawSolarObjectAbout(394, jupiter, 70, "#e3dccb", 0, 0);
            jupiter++;

            //saturn's ring
            a.drawSolarObjectAbout(479, saturn, 60, "WHITE", 0, 0);
            
            //saturn
            a.drawSolarObjectAbout(479, saturn, 55, "#b5651d", 0, 0);
            saturn++;

            //uranus
            a.drawSolarObjectAbout(559, uranus, 35, "#ADD8E6", 0, 0);
            uranus++;
            
            //neptune
            a.drawSolarObjectAbout(617, neptune, 30, "#00008B", 0, 0);
            neptune++;

            
            //earth's moon
            a.drawSolarObjectAbout(30, earth_moon, 5, "GREY", 251, earth);
            earth_moon= earth_moon + 3;

             
            //mars's moon 1
            a.drawSolarObjectAbout(35, mars_moon, 5, "GREY", 321, mars);
            mars_moon = mars_moon + 3;
            //mars's moon 2
            a.drawSolarObjectAbout(25, mars_moon2, 5, "GREY", 321, mars);
            mars_moon2 = mars_moon2 + 4;



            a.finishedDrawing();
            
        }
        
    }

}