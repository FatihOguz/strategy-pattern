package FatihOguz;

/**
 * this class extends Equation abstract class
 * and override displayEquation method
 */
public class MatrixLinear extends Equations{
    /**
     * no parameter constructor
     * allocate for linear equation  field
     */
    public MatrixLinear(){
        linearEquation = new LinearMatrisEquation();
    }

    /**
     * override displayEquation method
     * display equation way
     */
    @Override
    public void displayEquation() {
        System.out.println("Matrix Linear class");
    }
}
