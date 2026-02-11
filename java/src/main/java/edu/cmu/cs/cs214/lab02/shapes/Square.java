package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Square (квадрат) хэлбэрийг илэрхийлэх класс.
 */
public class Square implements Shape {
  private double sideLen;

  /**
   * Square үүсгэгч.
   *
   * @param sideLen квадратын талын урт
   */
  public Square(double sideLen) {
    this.sideLen = sideLen;
  }

  /**
   * Талбайг тооцоолно.
   *
   * @return квадратын талбай
   */
  public double getArea() {
    return sideLen * sideLen;
  }

  /**
   * Хэлбэрийн нэрийг буцаана.
   *
   * @return "Square"
   */
  public String getName() {
    return "Square";
  }
}
