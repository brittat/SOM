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
  private double t;

  public KohonenMap(int verticalNodes, int horizontalNodes, double learningParam, double neighborParam) {
    this.verticalNodes = verticalNodes;
    this.horizontalNodes = horizontalNodes;
    this.learningParam = learningParam;
    this.neighborParam = neighborParam;
    this.t = 0;
    //How to store nodes?
  }

  public void train() {
    // Loop over all input vectors
    // Competitive learning: find the winner; update winner according to learning rate function
    // Also update neighbors according to their distance from the winner
  }

  public double decay(double factor, double denominator) {
    double argument = - this.t/denominator;
    return factor*Math.exp(argument);
  }

  public int findWinner(double[] input) {
    //Loop over all nodes and find the one with weights closest to input
    double winningValue = -1;

    for (int i = 0; i < horizontalNodes; i ++) {
      for (int j = 0; j < verticalNodes; j ++) {

      }
    }
  }

  // Here learningRate will be 1 for the winning neuron
  public void updateWinner(int winner, double learningRate) {

  }

  public double dotProduct(double[] firstVector, double[] secondVector) {
    int numDim = firstVector.length;
    double dotProduct = 0;
    for (int i = 0; i < numDim; i ++) {
      dotProduct += firstVector[i]*secondVector[i];
    }
    return dotProduct;
  }
}
