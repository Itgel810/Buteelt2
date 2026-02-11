package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Renderer класс нь дүрс (Shape)-ийг дүрслэн хэвлэх үүрэгтэй.
 * Энэ класс нь зөвхөн Shape interface-ээс хамаарах бөгөөд
 * тухайн дүрсний бодит хэрэгжүүлэлтээс (Circle, Rectangle гэх мэт)
 * үл хамаарна.
 */
public class Renderer {

  /** Дүрслэн хэвлэх дүрс. */
  private Shape shape;

  /**
   * Renderer классын байгуулагч метод.
   *
   * @param shape дүрслэн хэвлэх Shape объект
   */
  public Renderer(Shape shape) {
    this.shape = shape;
  }

  /**
   * Дүрсийг хэвлэх метод.
   * Дүрсний нэр болон талбайг консол дээр гаргана.
   */
  public void draw() {
    System.out.println("Drawing shape: " + shape.getName());
    System.out.println("Area: " + shape.getArea());
    System.out.println("----------------------");
  }
}
