package com.yan.holamundo;

public class HolaMundo {
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo .l.");	
		short s = 0;
		byte j2 =0;
		int k =0;
		long l = 0;
		
		//cast de datos
		double d = 100.79;
		int in = (int) d;
		
		//System.out.println(i);
		
		//arreglos
		int[] array = new int[5];
		
		array[2] = 5;
		array[0] = 1;
		
		for(int i = 0; i < 5; i ++) {
			System.out.println(array[i]);
			
		}
		
		double[][] array_2 = new double[3][3];
		
		array_2[1][1] = 4.2;
		array_2[0][1] = 8.2;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(array_2[i][j]);
				
			}
		}
		
		int x = 6, y;
	    y = x++;
	    System.out.println(y + ", " +x);
		
	}

}
