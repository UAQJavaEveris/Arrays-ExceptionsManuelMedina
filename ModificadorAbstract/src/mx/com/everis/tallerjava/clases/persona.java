package mx.com.everis.tallerjava.clases;

import mx.com.everis.tallerjava.interfaces.interfaces;

abstract public class persona implements interfaces{

	/*
	 * clase abstracta puede tener metodos abstractos y no abstractos
	 * una clase normal no puede tener metodos abstractos
	 */
	
	
	public persona(){
		
	}
	
	public abstract String getNombre(); //el metodo abstracto solo nos da la definicion
	
	public void setNombre(){ //metodo no abstracto, ya que tiene cuerpo {...}
		
	}
	
	public String getApellido(){
		return "";
	}
	
}
