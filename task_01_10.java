
public class T_01_10_topic3 {

	public static void main(String[] args) {
		int[]array= {123, 232,365,454,565,655,755};
		int[]palidrom=new int[1];
		for (int i=0; i<array.length; i=i+1) {
			int k=array[i];
			int reverse = 0;
			while (k!= 0) {
		        int remainder = k % 10;
		        reverse = reverse * 10 + remainder;
		        k = k/ 10;
		    }
			if(k==reverse) {

			}
		}


	    


	}

}
