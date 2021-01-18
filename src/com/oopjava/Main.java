package com.oopjava;

public class Main {
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

		System.out.println();
		Mobil mobil1 = new Mobil();
		mobil1.nama = "Civic";
		mobil1.merek = "Honda";
		mobil1.harga = 533000000;
		System.out.println("Nama Mobil : \n" + mobil1.nama + "\nMerek Mobil :\n" + mobil1.merek + "\nHarga Mobil :" + mobil1.harga);
		mobil1.matic();

		System.out.println();
		Mobil mobil2 = new Mobil();
		mobil2.nama = "Brio";
		mobil2.merek = "Honda";
		mobil2.harga = 204000000;
		System.out.println("Nama Mobil : \n" + mobil2.nama + "\nMerek Mobil :\n" + mobil2.merek + "\nHarga Mobil :" + mobil2.harga);
		mobil2.manual();
	}		
}