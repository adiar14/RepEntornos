package Cferrari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import actFf7.C_constructor;

public class CpruebaMap {
// Introducimos cambios
	public static void main(String[] args) {
		HashMap<Integer, Integer> tablaAlea = new HashMap<Integer, Integer>();
		int num = 0;
		int valor = 0;
		for(int i = 0; i<100; i++) {
			num = generarAlea();
			
			if(tablaAlea.containsKey(num)) {
				valor = tablaAlea.get(num);
			}
			tablaAlea.put(num, valor + 1);
		}
		System.out.println(tablaAlea);
		for (int j = 1; j<=100; j++) {
			if (!tablaAlea.containsKey(j)){
				System.out.println(j);
			}
		}
		for(int u = 0; u<tablaAlea.size(); u++) {
			System.out.println(tablaAlea.values());
		}
	}
	private static int generarAlea(){
		Random r = new Random();
		int n = r.nextInt(100-1+1) + 1;
		
		return n;
	}
	
}
