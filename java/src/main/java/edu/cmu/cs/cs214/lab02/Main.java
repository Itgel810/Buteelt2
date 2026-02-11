package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/**
 * Main class for the shapes application.
 * This class creates various shapes and renders them using a Renderer.
 */
public class Main {

  /**
   * The entry point of the application.
   *
   * @param args command line arguments (not used).
   */
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    Shape square = new Square(3);

    Renderer r1 = new Renderer(circle);
    Renderer r2 = new Renderer(rectangle);
    Renderer r3 = new Renderer(square);

    r1.draw();
    r2.draw();
    r3.draw();
  }
}