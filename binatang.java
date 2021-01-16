package com.bsp.example.clas;

public abstract class binatang {

	public abstract void suara();

	public void Jenis (){
	System.out.println("Binatang");
	} 

}

public class Ayam extends binatang{
	@Override
	public void suara() {
		System.out.println("kukuruyuuuuukk ptok ptok");
	}			
}

public class Sapi extends binatang{
	@Override
	public void suara() {
		System.out.println("Moooooo");
	}
}