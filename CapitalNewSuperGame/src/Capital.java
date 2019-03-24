public class Capital {
	private String name;
	private int xCo;
	private int yCo;

	public Capital(String name, int xCo, int yCo) {
		this.name = name;
		this.xCo = xCo;
		this.yCo = yCo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getxCo() {
		return xCo;
	}

	public void setxCo(int xCo) {
		this.xCo = xCo;
	}

	public int getyCo() {
		return yCo;
	}

	public void setyCo(int yCo) {
		this.yCo = yCo;
	}
}