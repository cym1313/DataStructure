package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Sale[][][] = new int[][][] {{{1,2,3,4}, {5,6,7,8}},
	                            {{9,10,12,13},{14,15,16,17}}};
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				for(int k=0;k<2;k++)
			System.out.print(Sale[i][j][k]);
	}

}
