/**
 * Created by brittathornblom1 on 3/22/17.
 */
public class KohonenMap {
  // Number of vertical nodes
  private int verticalNodes;
  // Number of horizontal nodes
  private int horizontalNodes;
  // Parameter for learning rate function
  private double learningParam;
  // Parameter for neighborhood size function
  private double neighborParam;

  public KohonenMap(int verticalNodes, int horizontalNodes, double learningParam, double neighborParam) {
    this.verticalNodes = verticalNodes;
    this.horizontalNodes = horizontalNodes;
    this.learningParam = learningParam;
    this.neighborParam = neighborParam;
  }

  public void train() {
    // Loop over all input vectors
    // Competitive learning: find the winner; update winner according to learning rate function
    // Also update neighbors according to their distance from the winner
  }
}
