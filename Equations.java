package FatihOguz;


/**
 * this class abstract class
 */
public abstract class Equations {
    /**
     * linearEquation interface reference
     */
    LinearEquation linearEquation;

    /**
     * no parameter constructor
     */
    public Equations(){

    }

    /**
     * this method change class dynamically
     * these classes solve linear equation differently
     * @param linearEquation reference of linearequation interface
     */
    public void setLinearEquation(LinearEquation linearEquation) {
        this.linearEquation = linearEquation;
    }

    /**
     * different shows for linear equation class
     */
    public abstract void displayEquation();

    /**
     * perform linear equation method
     * this method is in interface(linearEquation)
     * which class implment this interface use linear equation
     */
    public void performLinearEquation(){

        linearEquation.linearEquation();

    }


}
