public class bitOperations{
	public static int getIth(int number, int pos){
		int bitMask = 1<<pos;
		if ((number&bitMask)==0) {
			return 0;
		}else{
			return 1;
		}
	}
	public static int setIth(int number, int pos){
		int bitMask = 1<<pos;
		return number | bitMask;
	}
	public static void main(String[] args) {
		System.out.println(getIth(10, 2));
		System.out.println(setIth(10,2));
	}
}