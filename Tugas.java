package hari03;

import java.util.Scanner;

import common.PrintArray;

public class Tugas {
	static Scanner scn;
	
	public static void main(String[] args) {
		scn=new Scanner(System.in);
		System.out.print("Masukkan N: ");
		int n=scn.nextInt();
		System.out.print("Masukkan M: ");
		int m=scn.nextInt();
		System.out.print("Masukkan O: ");
		int o=scn.nextInt();
		
		// Buat array deret
		int[] deret=new int[n*4];
		int x=3;
		for (int i = 0; i < deret.length; i++) {
			if (i%4==3) {
				deret[i]=x;
				x*=3;
			} else {
				deret[i]=o;
				o+=m;
			}
			System.out.print(deret[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		// mengisi array
		String[][] array=new String[n][n];
		int a=0;
		// isi baris ke 0
		for (int i = 0; i < n; i++) {
			array[0][i]=""+deret[a];
			a++;
		}
		// isi diagonal kanan
		for (int i = 1; i < n; i++) {
			array[i][(n-1)-i]=""+deret[a];
			a++;
		}
		// isi kolom ke 0
		for (int i = n-2; i>0; i--) {
			array[i][0]=""+deret[a];
			a++;
		}
		
		// mengisi array1
		String[][] array1=new String[n][n];
		int b=0;
		// isi diagonal
		for (int i = 0; i < n; i++) {
			array1[i][i]=""+deret[b];
			b++;
		}
		// isi baris ke n-1
		for (int i = n-2; i>=0; i--) {
			array1[n-1][i]=""+deret[b];
			b++;
		}
		// isi kolom ke 0
		for (int i = n-2; i>0; i--) {
			array1[i][0]=""+deret[b];
			b++;
		}
		
		// memanggil print array
		PrintArray.array2D(array);
		System.out.println("\n");
		PrintArray.array2D(array1);

	}
}
