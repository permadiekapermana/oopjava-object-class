package com.bsp.example.clas;
public class Main1 {
	public static void main(String[] args){
		Hewan hewan1 = new Hewan();
		hewan1.nama = "Kucing";
		hewan1.warna = "Putih";
		hewan1.umur = 3;
		System.out.println("Nama Hewan :\n" + hewan1.nama + "\nWarna Hewan :\n" + hewan1.warna + "\nUmur Hewan :\n" +hewan1.umur);
		System.out.println("Suara Hewan :");
		hewan1.mengeong();

		System.out.println();
		Hewan hewan2 = new Hewan();
		hewan2.nama = "Harimau";
		hewan2.warna = "Orange";
		hewan2.umur = 4;
		System.out.println("Nama Hewan :\n" + hewan2.nama + "\nWarna Hewan :\n" + hewan2.warna + "\nUmur Hewan :\n" +hewan2.umur);
		System.out.println("Suara Hewan :");
		hewan2.mengaum();
}		
}