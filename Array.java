import java.io.*;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(5);
		
		arr.add(100);
		arr.add(200);
		arr.add(0, 500);
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
}
