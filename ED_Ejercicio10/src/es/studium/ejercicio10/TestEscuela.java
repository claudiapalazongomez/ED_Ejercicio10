package es.studium.ejercicio10;

public class TestEscuela
{

	public static void main(String[] args)
	{
		Aula aula1 = new Aula("DAW", 20);
		Aula aula2 = new Aula("DAM", 15);
		Alumno alumno1 = new Alumno("Ana", "Abad", 22, true, aula1);
		Alumno alumno2 = new Alumno("Benito", "Bueno", 21, false, aula1);
		Alumno alumno3 = new Alumno("Carmen", "Cid", 24, true, aula2);
		
		System.out.println(alumno1.getNombre() + " " + alumno1.getApellido() + " estudia en " + alumno1.getAula().getNombre());
		System.out.println(alumno2.getNombre() + " " + alumno2.getApellido() + " estudia en " + alumno2.getAula().getNombre());
		System.out.println(alumno3.getNombre() + " " + alumno3.getApellido() + " estudia en " + alumno3.getAula().getNombre());
	}

}
