package MainPackage;

public class MyInteger {
	
	private int value;
	
	
	public int getInteger () {
		return value;
	}
	public void setInteger (int value) {
		this.value = value;
	}
	
	public MyInteger(int value) {
		setInteger(value);
	}
	
	public boolean isEven() {
		if (this.getInteger() % 2 == 0) {
			return true;
		}
		else return false;
	}
	
	public boolean isOdd() {
		if (this.getInteger() % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	public boolean isPrime() {
		for(int i=1; i <= this.getInteger(); i++) {
			if (this.getInteger() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		}
		else return false;
	}
	public static boolean isOdd(int val) {
		if (val % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	public static boolean isPrime(int val) {
		for(int i=1; i <= val; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger MyInt) {
		if (MyInt.getInteger() % 2 == 0) {
			return true;
		}
		else return false;
	}
	public static boolean isOdd(MyInteger MyInt) {
		if (MyInt.getInteger() % 2 != 0) {
			return true;
		}
		else return false;
	}
	
	public static boolean isPrime(MyInteger MyInt) {
		for(int i=1; i <= MyInt.getInteger(); i++) {
			if (MyInt.getInteger() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int val) {
		if (this.getInteger() == val) {
			return true;
		}
		else return false;
	}
	
	public boolean equals(MyInteger MyInt) {
		if (MyInt.getInteger() == this.getInteger()) {
			return true;
		}
		else return false;
	}
	
	public static int parseInt(char[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static int parseInt(String numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length(); i++) {
			sum += numbers.charAt(i);
		}
		return sum;
	}
	
}


