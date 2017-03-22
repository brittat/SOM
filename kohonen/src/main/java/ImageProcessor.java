import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brittathornblom1 on 3/22/17.
 */
public class ImageProcessor {
  private BufferedImage img;
  private int numVectors;
  private int height;
  private int width;

  public ImageProcessor(String filePath) {
    readImage(filePath);
  }

  public void readImage(String filePath) {
    try {
      this.img = ImageIO.read(new File("strawberry.jpg"));
      this.height = this.img.getHeight();
      this.width = this.img.getWidth();
      this.numVectors = this.height*this.width;
    } catch (IOException e) {
    }
  }

  public List<double[]> getVectors() {
    List<double[]> vectors = new ArrayList<double[]>();
    int binaryPixelRgb;
    for (int i = 0; i < this.height; i ++) {
      for (int j = 0; j < this.width;j ++) {
        binaryPixelRgb = this.img.getRGB(i, j);
        vectors.add(binaryToArray(binaryPixelRgb));
      }
    }
    return vectors;
  }

  public double[] binaryToArray(int binaryColor) {
    double[] vector = new double[3];
    Color pixelColor = new Color(binaryColor);
    vector[0] = pixelColor.getRed();
    vector[1] = pixelColor.getGreen();
    vector[2] = pixelColor.getBlue();
    return vector;
  }
}
