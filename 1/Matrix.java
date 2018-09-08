package hw01;

public class Matrix {
	int row = 0;
	int col = 0;
	int row_lo = 0;
	double[][] matrix;

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new double[row][col];
	}

	public void setMatrix(double... d) {
		for (int i = 0; i < d.length; i++) {
			matrix[row_lo][i] = d[i];
		}
		row_lo++;
	}

	public Matrix addMatrix(Matrix otherMatrix) {
		Matrix sum = new Matrix(row, col);
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				sum.matrix[j][i]+=matrix[j][i]+otherMatrix.matrix[j][i];
			}
		}
		return sum;
	}

	public Matrix multiMatrix(Matrix otherMatrix) {
		Matrix multi = new Matrix(row, otherMatrix.col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < otherMatrix.col; j++) {
				for (int n = 0; n < col; n++) {
					multi.matrix[i][j] += matrix[i][n] * otherMatrix.matrix[n][j];
				}
			}
		}
		return multi;
	}

	public Matrix transposed() {
		Matrix trans = new Matrix(col, row);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				trans.matrix[j][i] = matrix[i][j];
			}
		}
		return trans;
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				System.out.print("[");
			} else {
				System.out.print(" [");
			}
			for (int n = 0; n < col; n++) {
				System.out.print(matrix[i][n]);
				if (n != col - 1) {
					System.out.print(", ");
				}
			}
			if (i == row - 1) {
				System.out.print("]]");
			} else {
				System.out.println("]");
			}
		}
		System.out.println();
	}
}

class MatrixTest {
	public static void main(String[] args) {

		Matrix mat1 = new Matrix(3, 2);
		mat1.setMatrix(1, -2);
		mat1.setMatrix(3, 4);
		mat1.setMatrix(5, 6);
		System.out.println("첫번쨰 행렬:");
		mat1.print();

		Matrix mat2 = new Matrix(2, 3);
		mat2.setMatrix(1, 2, 3);
		mat2.setMatrix(4, 5, 6);
		System.out.println();
		System.out.println("두번쨰 행렬:");
		mat2.print();

		System.out.println();
		System.out.println("두 행렬의 곱셈:");
		mat1.multiMatrix(mat2).print();

		System.out.println();
		System.out.println("첫번쨰 행렬+첫번째 행렬");
		mat1.addMatrix(mat1).print();

		System.out.println();
		System.out.println("두번쨰 행렬의 전치행렬");
		mat2.transposed().print();
	}
}
