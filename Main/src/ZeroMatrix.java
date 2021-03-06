
public class ZeroMatrix {
	ZeroMatrix(){}
	void setZeroRowCol(int[][] matrix) {
		boolean[] rowZero = new boolean[matrix.length];
		boolean[] colZero = new boolean[matrix[0].length]; 
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[0].length;col++) {
				if(matrix[row][col]==0) {
					rowZero[row]=true;
					colZero[col]=true;
				}
			}
		}
		for(int i=0;i<rowZero.length;i++) {
			if(rowZero[i]) {
				setZeroRow(matrix, i);
			}
		}
		for(int i=0;i<colZero.length;i++) {
			if(colZero[i]) {
				setZeroCol(matrix,i);
			}
		}
		
	}

	private void setZeroCol(int[][] matrix, int col) {
		// TODO Auto-generated method stub
		for(int row=0;row<matrix.length;row++) {
			matrix[row][col]=0;
		}
	}

	private void setZeroRow(int[][] matrix,int row) {
		// TODO Auto-generated method stub
		for(int col=0;col<matrix[0].length;col++) {
			matrix[row][col]=0;
		}
	}
}
