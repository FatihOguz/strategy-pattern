package FatihOguz;

/**
 * this class extends Equation abstract class
 */
public class GaussLinear extends Equations{
    /**
     * constructor
     * assign LinearGaussEquation class reference for linearEquation field
     *LinearEquaition interface has  this field
     */
    public GaussLinear(){
        linearEquation = new LinearGausEquation();
    }

    /**
     * implement abstract method from Equations class
     */
    @Override
    public void displayEquation() {
        System.out.println("GaussLinear class");
    }

}
