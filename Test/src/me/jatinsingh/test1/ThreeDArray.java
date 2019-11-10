package me.jatinsingh.test1;

public class ThreeDArray {

	public static void main(String[] args) {

		int [][][] arr = {
				{{0,1},
					{1,1}},
				{{0,1},
						{0,0}},
		};
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				for(int k = 0 ; k < 2 ; k++) {
					System.out.print(arr[i][j][k] + "  ");
				}
				System.out.print("\n");
			}
		}
	}
}
