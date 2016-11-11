import java.util.*;
import java.util.Arrays;

public class Scratch
{

	public static void main(String[] args)
	{
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(5);
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		list2.add(2);
//		list2.add(3);
//		list2.add(6);
//
//		list1.addAll(list2);
//
//		StdOut.println(list1);
//
//		ArrayList<String> list = new ArrayList<>();
//		list.add("red");
//		list.add("green");
//		list.add("red");
//		list.add("green");
//
//		String element = "red";
//		for (int i = list.size()-1; i >= 0; i--)
//			if (list.get(i).equals(element))
//			{
//				list.remove(element);
//				// i--;
//			}
//		
//		StdOut.println(list);

		// ArrayList a = new List<String>({"red", "green", "blue"});
		// new List<String>(new String[]{"red", "green", "blue"})
		
		StdOut.println(Arrays.<String>asList(new String[]{"red", "green", "blue"}));
		StdOut.println(new ArrayList(Arrays.<String>asList(new String[]{"red", "green", "blue"})));
//		new LinkedList(new String[]{"red", "green", "blue"});

	}

}
