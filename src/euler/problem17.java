package euler;

import java.util.Hashtable;

public class problem17 {


	static Hashtable<Integer, Integer> l = new Hashtable<Integer, Integer>();
	public static void main(String[] args){
		int total = 0;
		l.put(0, 0); // zero is not spoken
		l.put(1, 3); // one
		l.put(2, 3); // two
		l.put(3, 5); // three
		l.put(4, 4); // four
		l.put(5, 4); // five
		l.put(6, 3); // six
		l.put(7, 5); // seven
		l.put(8, 5); // eight
		l.put(9, 4); // nine
		l.put(10, 3); // ten
		l.put(11, 6); // eleven
		l.put(12, 6); // twelve
		l.put(13, 8); // thirteen
		l.put(14, 8); // fourteen
		l.put(15, 7); // fifteen
		l.put(16, 7); // sixteen
		l.put(17, 9); // seventeen
		l.put(18, 8); // eighteen
		l.put(19, 8); // nineteen
		l.put(20, 6); // twenty
		l.put(30, 6); // thirty
		l.put(40, 5); // forty
		l.put(50, 5); // fifty
		l.put(60, 5); // sixty
		l.put(70, 7); // seventy
		l.put(80, 6); // eighty
		l.put(90, 6); // ninety
		//if numbers went higher than 1000, better to instead use a single entry for 'hundred', 'thousand', etc
		l.put(100, 10); // one hundred
		l.put(200, 10); // two hundred	
		l.put(300, 12); // three hundred
		l.put(400, 11); // four hundred
		l.put(500, 11); // five hundred
		l.put(600, 10); // six hundred
		l.put(700, 12); // seven hundred
		l.put(800, 12); // eight hundred
		l.put(900, 11); // nine hundred
		l.put(1000, 11); // one thousand

		for(int i=1;i<1001;i++){ 
			total += lexify(i);
		}
		System.out.println(total);
		
	}
	
	public static int lexify(int i){
		if(l.containsKey(i)){
			return l.get(i);
		}else if(i>100){
			// +3 for "and" featured in >100 numbers
			return lexify(100*(i/100)) + 3 + lexify(i%100);
		}else if(i>20){
			return lexify(10*(i/10)) + lexify(i%10);
		}else{
			System.out.println("Whoops, had trouble with "+i);
			System.exit(0);
			return 0;
		}
	}
}
