package euler;

public class problem14 {


	static long[] collatzNumbers = new long[1000000];

	public static void main(String[] args){
		
		long result = 0;
		for(long i=1;i<1000000;i++){
			if(collatzNumbers[(int) i]==0){
				collatzNumbers[(int) i] = collatz(i);
				if(collatzNumbers[(int) i]>collatzNumbers[0]){
					collatzNumbers[0] = collatzNumbers[(int) i];
					result = i;
					//System.out.println("Collatz # of "+i+" is "+collatzNumbers[(int) i]);
				}
			}
		}
		System.out.println("MAX RESULT: "+result+" with Collatz Number of "+collatzNumbers[0]);
	}

	private static long collatz(long i) {
		if(i<1000000){
			if(collatzNumbers[(int) i]!=0){
				return 1+collatzNumbers[(int) i];
			}
		}
		if(i==1){
			return 1;
		}else if((i%2)==0){
			long temp = collatz(i/2);
			if(i<1000000){
				collatzNumbers[(int) i] = temp;
			}
			return temp+1;
		}else{
			long temp = collatz(i*3+1);
			if(i<1000000){
				collatzNumbers[(int) i] = temp;
			}
			return temp+1;
		}
	}
}
