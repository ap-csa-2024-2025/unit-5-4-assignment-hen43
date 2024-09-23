public class Main
{
  public static void main(String[] args)
  {
    System.out.println(distance(4,5,9,2)); 
    System.out.println(quadraticPlus(1,3,2));
    System.out.println(quadraticMinus(1,3,2));
    // theCoolerQuadratic(1,3,2);
  }

  // Implement distance formula method here

  public static double distance(int x1, int y1, int x2, int y2){
    double point1 = x2 - x1;
    double point2 = y2 - y1;
    double distance = Math.sqrt(point1 * point1 + point2 * point2);

    return(distance);
  }

  public static double quadraticPlus(double a, double b, double c){
    double ans = (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
    return(ans);
  }

  public static double quadraticMinus(double a, double b, double c){
    double ans = (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
    return(ans);
  }

  // public static void theCoolerQuadratic(double a, double b, double c){
  //   double skibidi = quadraticPlus(a,b,c);
  //   double ohio = quadraticMinus(a,b,c);

  //   System.out.println(skibidi);
  //   System.out.println(ohio);
  // }
}
