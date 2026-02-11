package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Геометрийн хэлбэрийг илэрхийлэх интерфэйс.
 * Бүх хэлбэрүүд талбай болон нэртэй байна.
 */
public interface Shape {

  /**
   * Хэлбэрийн талбайг буцаана.
   *
   * @return хэлбэрийн талбай
   */
  double getArea();

  /**
   * Хэлбэрийн нэрийг буцаана.
   *
   * @return хэлбэрийн нэр
   */
  String getName();
}
