package methaporce.modelo;

public class Pelicula {
	private int Id;
	private String Nombre;
	private boolean Disponible;
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public int getId() {
		return this.Id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public boolean isDisponible() {
		return Disponible;
	}

	public void setDisponible(boolean disponible) {
		Disponible = disponible;
		
	}

	public Pelicula(int id, String nombre, boolean disponible) {
		super();
		Id = id;
		Nombre = nombre;
		Disponible = disponible;
	}
	
	

}
