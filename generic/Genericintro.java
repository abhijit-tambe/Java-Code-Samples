//package collectionandgenerics;
import java.util.*;

public class Genericintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"hey","man","you","doing","good"};
		Integer[] b = {5,6,9,321,451,4,54,662,4};
		Character[] c = {'A','b','h','i','j','i','t'};
		List<String> l1 = new ArrayList<String>(Arrays.asList(a));
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(b));
		Set<Character> cha = new HashSet<Character>(Arrays.asList(c));
		
		Printme(a);
		Printme(b);
		Printme(c);
		Printme(l1);
		Printme(set);
		Printme(cha);
		
	}
	
	private static <T> void Printme(T[] x)
	{
		for(T i:x)
		{
		System.out.print(i +",");
		}
		System.out.println();
	}
	
	private static <S> void Printme(S y)
	{
		
		System.out.println(y);
	}

}
