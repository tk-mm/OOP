package ex5;

import java.util.*;

public class SumAndAverage {
	public static void main(String[] args){
		ArrayList<String> sumlist = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		while(scanner.hasNext()){
			String sum = scanner.nextLine();
			if(sum.equals("")){
				break;
			}
			sumlist.add(sum);
		}
		scanner.close();
		int sum = 0;
		for(String line: sumlist){
			sum += Integer.parseInt(line);
			System.out.println(line);
		}
		System.out.println(sum);
		System.out.println(sum/sumlist.size());
	}

}
