package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Rectangle хэлбэрийг илэрхийлэх класс.
 */
public class Rectangle implements Shape {
  private double height;
  private double width;

  /**
   * Rectangle үүсгэгч.
   *
   * @param height тэгш өнцөгтийн өндөр
   * @param width тэгш өнцөгтийн өргөн
   */
  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  /**
   * Талбайг тооцоолно.
   *
   * @return тэгш өнцөгтийн талбай
   */
  public double getArea() {
    return height * width;
  }

  /**
   * Хэлбэрийн нэрийг буцаана.
   *
   * @return "Rectangle"
   */
  public String getName() {
    return "Rectangle";
  }
}
