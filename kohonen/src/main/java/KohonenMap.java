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

  public String findWinner(double[] input) {
    //Loop over all nodes and find the one with weights closest to input
    double winningValue = -1;
    double similarity;
    String winner = "00";

    for (int i = 0; i < horizontalNodes; i ++) {
      for (int j = 0; j < verticalNodes; j ++) {
        String key = "" + i + j;
        similarity = getSimilarity(neurons.get(key), input);
        if (similarity > winningValue) {
          winningValue = similarity;
          winner = key;
        }
      }
    }
    return winner;
  }

  // Here learningRate will be 1 for the winning neuron
  public void updateWinner(int winner, double learningRate) {
  public List<String> findWinnerNeighbors(String winner) {
    //get the current max distance to winning neighbors
    // loop through neighbors and see if they're winners
    // alt: do a discrete approx.
    List<String> winningNeighbors;

  }


  public void updateNeuron(String neuron, double learningRate) {

  }

  public double getUpdateRate() {
    return decay(this.learningFactor, this.learningDenom);
  }

  public double getNeighborhoodRadius() {
    return decay(this.neighborhoodFactor, this.neighborhoodDenom);
  }

  public double getSimilarity(double[] input, double[] neuron) {
    return getMagnitude(input)*getMagnitude(neuron)/dotProduct(input, neuron);
  }

  public double dotProduct(double[] firstVector, double[] secondVector) {
    int numDim = firstVector.length;
    double dotProduct = 0;
    for (int i = 0; i < numDim; i ++) {
      dotProduct += firstVector[i]*secondVector[i];
    }
    return dotProduct;
  }

  public double getMagnitude(double[] vector) {
    double sum = 0;
    for (int i = 0; i < vector.length; i ++) {
      sum += Math.pow(vector[i], 2);
    }
    return Math.sqrt(sum);
  }
}
