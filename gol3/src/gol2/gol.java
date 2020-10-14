package gol2;

import java.io.IOException;

public class gol {
	public static int[][][] matrix;
	public static int x;
	public static int y = 0;
	public static String printline = "";
	public static void main(String[] args) throws IOException, InterruptedException {
	
		matrix = new int[500][500][2];
		matrix_init();
		do {
			print();
			reset();
			matrix_next_gen();
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
			
		}while(true);
		
		
	}
	static void reset() {
		int alive = 0;
		for (y = 1;y<499;y++) {
			for (x=1;x<499;x++) {
				matrix[x][y][0]=0;
			}
			}
	}
	static void matrix_init() {
	
		for (y = 0;y<500;y++) {
			for (x=0;x<500;x++) {
				matrix[x][y][1]=0;
			}
		}
		
		matrix[10][10][1]=1;
		matrix[11][10][1]=1;
		matrix[11][11][1]=1;
		matrix[12][11][1]=1;
		matrix[11][12][1]=1;
		
		
		matrix[44][43][1]=1;
		matrix[43][43][1]=1;
		matrix[44][44][1]=1;
		matrix[45][44][1]=1;
		matrix[44][45][1]=1;
	}
	
	static void print() {
		printline="";
		int x,y = 0;
		for (y = 0;y<500;y++) {
		
			
			for (x=0;x<500;x++) {
				switch(matrix[x][y][1]) {
				case 0:
					printline+="░";
					break;
				case 1:
					printline+="■";
					break;
				} 	
				printline+=" ";
			}
			System.out.println(printline);
			printline="  ";
		}
		
	}
	static void matrix_next_gen() {
		int alive = 0;
		for (y = 1;y<499;y++) {
			for (x=1;x<499;x++) {
					
				
				if(matrix[x-1][y-1][1]==1)
					alive++;
				if(matrix[x][y-1][1]==1)
					alive++;
				if(matrix[x+1][y-1][1]==1)
					alive++;
				if(matrix[x-1][y][1]==1)
					alive++;
				if(matrix[x+1][y][1]==1)
					alive++;
				if(matrix[x-1][y+1][1]==1)
					alive++;
				if(matrix[x][y+1][1]==1)
					alive++;
				if(matrix[x+1][y+1][1]==1)
					alive++;
				if (alive==2 || alive==3)
					matrix[x][y][0]=1;
				else
					matrix[x][y][0]=0;
				alive=0;
				
			
	
			}
			
		}
		for (y = 0;y<500;y++) {
			for (x=0;x<500;x++) {
				matrix[x][y][1]=matrix[x][y][0];
			}
		}
	}
}
