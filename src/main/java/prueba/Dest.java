package prueba;

public class Dest {

    private String name;
    private int age;
    private String apellido;
    private Intermedio intermedio;

    public Dest() {}

    public Dest(String name, int age) {
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Intermedio getIntermedio() {
		return intermedio;
	}

	public void setIntermedio(Intermedio intermedio) {
		this.intermedio = intermedio;
	}
}
