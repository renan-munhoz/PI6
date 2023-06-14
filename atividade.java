import Jama.EigenvalueDecomposition;
import Jama.Matrix;

public class atividade {

    public static void main(String[] args) {
        double[][] matriz = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        Matrix matrizJama = new Matrix(matriz);
        EigenvalueDecomposition eigen = matrizJama.eig();

        Matrix autovalores = eigen.getD();
        double autovalor = autovalores.get(0, 0);

        Matrix autovetores = eigen.getV();
        Matrix autovetor = autovetores.getMatrix(0, autovetores.getRowDimension() - 1, 0, 0); 

        System.out.println("Autovalor: " + autovalor);
        System.out.println("Autovetor: ");
        autovetor.print(10, 6);
    }
}