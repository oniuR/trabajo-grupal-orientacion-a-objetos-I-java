package modelo;

import java.time.LocalDate;

public class Entrenador extends Persona {
	private String estrategiaFavorita;
	public Entrenador(int id,String nombre, String apellido, long dni, LocalDate fechaNacimiento,String estrategiaFavorita) {
		super(id,nombre, apellido, dni, fechaNacimiento);
		this.estrategiaFavorita = estrategiaFavorita;
	}
	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}
	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}
	@Override
	public String toString() {
		return super.toString() + "estrategia favorita=" + estrategiaFavorita;
	}
}
