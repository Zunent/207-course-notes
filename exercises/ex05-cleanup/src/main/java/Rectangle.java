/**
 * A rectangle that can be scaled and compared to other rectangles.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle with width {@code w} and height {@code h}.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of the rectangle, calculated as the product of its width and height.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor by which to scale the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle is larger than {@code other}.
   *
   * @param other the rectangle to be compared against
   * @return whether this rectangle is larger than {@code other}
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
