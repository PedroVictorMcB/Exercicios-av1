package exerciciosSala;

public class AvengersList {

	private int size;
	private Object[] list;
	private int i;
	
	public AvengersList(int size) {
		if (size > 0) {
			this.size = size;
		} else {
			this.size = 1;
		}
		
		list = new Object[this.size];
		this.i = 0;
	}
	
	public void parkersGFS(String gf) {
		if(i < size) {
			list[i] = gf;
			i++;
		} else {
			System.out.println("Lista cheia");
		}
	}
	
	public Object hawkEye(int index) {
		if(index < 0 || index >= size) {
			System.out.println("out of boundrys");
		} 
		
		return list[index];
	}
	
	public int sizeOf() {
		return size;
	}
	
	public Object negan() {
		
		return
	}
}
