public class HomeTask1 {
    public static void main(String[] args) {
        double y = 2.71;
        double Z = 3 * Math.pow(y, 2)+Math.sqrt(( Math.pow(y, 3)) + 1 );
        double S = Math.sqrt( Math.cos( Math.toRadians(4*Math.pow(y, 2))) + 7.151);

        System.out.println("y= "+y);
        System.out.printf("Z= %.3f %n", Z);
        System.out.printf("S= %.3f %n", S);
        }
}
