import java.io.Console;
import java.util.Arrays

public class replPractice {
  public static void main(String[] args) {
    Console myConsole = System.console();

   class Triangle {
      public Integer mSide1;
      public Integer mSide2;
      public Integer mSide3;

      public Triangle (Integer entry1, Integer entry2, Integer entry3) {
        mSide1 = entry1;
        mSide2 = entry2;
        mSide3 = entry3;
      }
    }
    System.out.println("please specify side lengths for your triangle");
    String userSide1 = myConsole.readLine();
    String userSide2 = myConsole.readLine();
    String userSide3 = myConsole.readLine();


    Triangle userTriangle = new Triangle(Integer.parseInt(userSide1),Integer.parseInt(userSide2),Integer.parseInt(userSide3));

    triangleAnalysis(userTriangle.mSide1, userTriangle.mSide2, userTriangle.mSide3);

// is it a triangle?
}
  public static void triangleAnalysis(Integer side1, Integer side2, Integer side3) {

    if ( side1 + side2 > side3 || side2 + side3 >side1 || side3 + side1 > side2) {
      System.out.println("you made a triangle");
      //what kind of triangle:
      if ((side1 == side2) && (side2 == side3) && (side1 == side3)) {
          System.out.println("you made an equilateral triangle");
        } else if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
          System.out.println("you made an scalene triangle");
        } else {
          System.out.println("you made an isoceles triangle");
        }

      } else {
      System.out.println("it is physically impossible to create a triangle with sides of those lengths");
    }
  }
}
