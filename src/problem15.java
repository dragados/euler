package euler;

public class problem15 {
	
	// formula for NxN lattice:
	// sum of the squares of each number in the (N+1)th level of the binomial expansion
	public final static long size = 20; 
	
	public static void main(String[] args){
		long total=0;
		long fact = factorial(size);
		for(int i=0;i<size+1;i++){
			long temp = fact/(factorial(i)*factorial(size-i));
			System.out.print(temp+"\t");
			total+=Math.pow(temp, 2);
		}

		System.out.println();
		System.out.println(total);
	}
	
	public static long factorial(long l){
		if(l==0){
			return 1;
		}else{
			return l*factorial(l-1);
		}
	}
}
