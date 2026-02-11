package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Circle хэлбэрийг илэрхийлэх класс.
 */
public class Circle implements Shape {
  private double radius;

  /**
   * Circle үүсгэгч.
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Талбайг тооцоолно.
   */
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   * Хэлбэрийн нэрийг буцаана.
   */
  public String getName() {
    return "Circle";
  }
}
