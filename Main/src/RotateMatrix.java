
public class RotateMatrix {
		RotateMatrix(){}
		void rotate(int[][] matrix) {
			int n=matrix.length;
			int[] temp = new int[matrix.length];
			
			for(int layer=0;layer<matrix.length/2;layer++) {
				for(int i=0;i<matrix[layer].length-1;i++) {
					temp[i]=matrix[layer][i];
					//left to top
					matrix[layer][i]=matrix[n-1-i][layer];
					//bottom to left
					matrix[n-1-i][layer]=matrix[n-1-layer][n-1-i];
					//right to bottom
					matrix[n-1-layer][n-1-i]=matrix[i][n-1-layer];
					//top to right
					matrix[i][n-1-layer]=temp[i];
				}
			}
		}
}
