package Lab_Encapsulation;

public class RoulettePocket {

	private int number;

	public RoulettePocket(int number) {
		this.number = number;
	}
	
	

	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	

	public String getPocketColor() {
		if (number == 0) {
			return "green";
		} else if (number <= 10) {
			if (number % 2 != 0) {
				return "red";
			} else {
				return "black";
			}
		} else if (number <= 18) {
			if (number % 2 != 0) {
				return "black";
			} else {
				return "red";
			}
		} else if (number <= 28) {
			if (number % 2 != 0) {
				return "red";
			} else {
				return "black";
			}
		} else if (number <= 36) {
			if (number % 2 != 0) {
				return "black";
			} else {
				return "red";
			}
		} else {
			return "invalid number!!! Please enter a number only 0 between 36";
		}
	}

}
