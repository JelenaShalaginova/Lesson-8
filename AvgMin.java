package lesson8;

public class AvgMin {
	
	//declare instance variable
	private int[] number;
	private int min;
	
	//constructor
	public AvgMin() {
		
	}
	
	public void setNumbers(int[] number) {
		this.number = number;
	}
	
	public int getMin() {
		return min;
	}
	
	public void computeMin() {
	//initialize the min with the first element of the []
	min = number[0];
	for(int i = 1; i< number.length; i++) {
		if(number[i]<min) {
			min = number[i];
		}
	}
	
	}//end main
}//end class
