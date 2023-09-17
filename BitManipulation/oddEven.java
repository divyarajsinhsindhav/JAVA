public class oddeven{
	public static void oddEvenNumber(int number){
		int bitMask = 1;
		if ((number & bitMask) == 1) {
			System.out.println(number + " is odd");
		}else{
			System.out.println(number + " is even");
		}
	}
	public static void main(String[] args) {
		oddEvenNumber(3);
		oddEvenNumber(4);
		oddEvenNumber(14);
		oddEvenNumber(5);
	}
}