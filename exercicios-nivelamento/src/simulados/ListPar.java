package simulados;

import java.util.Arrays;

public class ListPar {
	private int[] nums;
	private int[] pairNums;
	private int[] evenNums;

	public static void main(String[] args) {
		int[] N = {1, 2, 3};
		ListPar listaNum = new ListPar(N);
		
		listaNum.percorrerArray();

	}
	
	public ListPar(int[] nums) {
		this.nums = nums;
	}



	@Override
	public String toString() {
		return "ListPar [nums=" + Arrays.toString(nums) + "]";
	}

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public void percorrerArray(int from) {
//		System.out.println(this.nums.length);
		if((this.pairNums.length + this.evenNums.length) == this.nums.length) {
			return;
		}
		if(this.nums[from] % 2 == 0) {
			this.pairNums[]
		}
				
	}

	
}
