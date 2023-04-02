public class Notificator {
	public void showValue() {
		String value = String.format("---%d---", 33);
		System.out.println(value);
	}

	public String getMultipleValue(int a, int b) {
		int result = a * b;
		return String.format("~~~%d~~~", result);
	}


}
