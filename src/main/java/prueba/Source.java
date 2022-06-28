package prueba;

public class Source {
	
    private String name;
    private int age;
    private String descripcion;
    private Intermedio intermedio;
    
    public Source() {}

    public Source(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Intermedio getIntermedio() {
		return intermedio;
	}

	public void setIntermedio(Intermedio intermedio) {
		this.intermedio = intermedio;
	}
}
