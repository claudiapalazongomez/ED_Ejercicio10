package es.studium.ejercicio10;

public class Aula
{
	private String nombre;
	private int numAlumnos;
	
	public Aula()
	{
		nombre = "";
		numAlumnos = 0;
	}

	public Aula(String nombre, int numAlumnos)
	{
		this.nombre = nombre;
		this.numAlumnos = numAlumnos;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getNumAlumnos()
	{
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos)
	{
		this.numAlumnos = numAlumnos;
	}
	
	
}
