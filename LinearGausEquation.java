package FatihOguz;


import java.util.Scanner;

/**
 * this class implemet LinearEquations
 * and implement linear equation
 */
public class LinearGausEquation implements LinearEquation {
    private static final double EPSILON = 1e-10;
    public void linearEquation() {
        System.out.println("GAUSS EQUATION");
        System.out.println("matris size for gauss elimination :");

        Scanner scanner = new Scanner(System.in);
        int matris_size = scanner.nextInt();
        System.out.println("matrix " + matris_size + " 'e " + matris_size);
        double[][] A = new double[matris_size][matris_size];
        double[] B = new double[matris_size];

        System.out.println("Let's fill in our matrix");
        for(int i =0;i<matris_size;i++){
            for(int j=0;j<matris_size;j++){

                System.out.println("enter a number");
                A[i][j]=scanner.nextInt();
                System.out.println("*******MATRIX********");
                for(int a=0;a<matris_size;a++){
                    for(int b =0;b<matris_size;b++){
                        System.out.print(A[a][b] + " ");
                    }
                    System.out.println();
                }
            }

        }
        System.out.println("Enter the elements of index: ");
        for(int j =0;j<matris_size;j++){
            System.out.println("enter a number");
            B[j]=scanner.nextInt();
            for(int b =0;b<matris_size;b++){
                System.out.print(B[b] + " ");
            }
            System.out.println();
        }

        System.out.println("GAUSS EQUATION");
        lsolve(A,B);
    }


    /**
     * heşping method for linear equation
     * @param A matris
     * @param b index
     */
    public static void lsolve(double[][] A, double[] b){
    // Gaussian elimination with partial pivoting

            int n = b.length;

            for (int p = 0; p < n; p++) {

                // find pivot row and swap
                int max = p;
                for (int i = p + 1; i < n; i++) {
                    if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                        max = i;
                    }
                }
                double[] temp = A[p]; A[p] = A[max]; A[max] = temp;
                double   t    = b[p]; b[p] = b[max]; b[max] = t;

                // singular or nearly singular
                if (Math.abs(A[p][p]) <= EPSILON) {
                    throw new ArithmeticException("Matrix is singular or nearly singular");
                }

                // pivot within A and b
                for (int i = p + 1; i < n; i++) {
                    double alpha = A[i][p] / A[p][p];
                    b[i] -= alpha * b[p];
                    for (int j = p; j < n; j++) {
                        A[i][j] -= alpha * A[p][j];
                    }
                }
            }

            // back substitution
            double[] x = new double[n];
            for (int i = n - 1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i + 1; j < n; j++) {
                    sum += A[i][j] * x[j];
                }
                x[i] = (b[i] - sum) / A[i][i];
            }





        System.out.println("gaus equation");

        // print results
        for (int i = 0; i < A.length; i++) {
            System.out.println(x[i]);
        }
    }


}

