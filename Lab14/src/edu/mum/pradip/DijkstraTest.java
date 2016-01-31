package edu.mum.pradip;

public class DijkstraTest {

	public static void main(String[] args) {

//		int[][] array ={ 	//expected: {A=0, B=1, C=2, D=2}
//			 {0, 1, 2, 2},
//			 {1, 0, 0, 3},
//			 {2, 0, 0, 0},
//			 {2, 3, 0, 0}
//		 };
		
		 
//		int[][] array ={	 //expected: {A=0, B=2, C=4, D=2, E=3, F=5}
//				 {0, 2, 5, 2, 0, 0},
//				 {2, 0, 4, 0, 0, 0},
//				 {5, 4, 0, 2, 0, 0},
//				 {2, 0, 2, 0, 1, 0},
//				 {0, 0, 0, 1, 1, 2},
//				 {0, 0, 0, 0, 2, 0},
//		};	
		
		
		int[][] array ={		//{A=0, B=22, C=9, D=12, E=45, F=51, G=63, H=56, I=42}
				{0, 22, 9, 12, 0, 0, 0, 0, 0},
				{22, 0, 35, 0, 0, 36, 0, 34, 0},
				{9, 35, 0, 4, 65, 42, 0, 0, 0},
				{12, 0, 4, 0, 33, 0, 0, 0, 30},
				{0, 0, 65, 33, 0, 18, 23, 0, 0},
				{0, 36, 42, 0, 18, 0, 39, 24, 0},
				{0, 0, 0, 0, 23, 39, 0, 25, 21},
				{0, 34, 0, 0, 0, 24, 25, 0, 19},
				{0, 0, 0, 30, 0, 0, 21, 19, 0}
		};
		
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array[i].length; j++){
				 if(array[i][j] == 0){
					 //Converting 0 to largest value
					 array[i][j] = Dijkstra.LARGE_VALUE;
				 }
			 }
		 }

		System.out.println(new Dijkstra(array).doDijkstra());
	}

}
