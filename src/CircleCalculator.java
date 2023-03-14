public class CircleCalculator {
    //this is the name of the program
    public static void main(String[] args) {
        /*in here we gonna calculate the various values of a circle starting from the known radius and
        without the use of the method pi*/
        double circleRadius = 12.0;
        double circleDiameter = circleRadius*2;
        double circleCircumference = circleDiameter*3.14;
        double circleArea = 3.14*circleRadius*circleRadius;
        //and we gonna print the various values one by one on multiple lines
        System.out.println("Being the radius a value of " + circleRadius +" cm.");
        System.out.println("The diameter will be " + circleDiameter +" cm.");
        System.out.println("The circumference will be " + circleCircumference +" cm.");
        System.out.println("And the area will be " + circleArea +" cm.");

    }
}