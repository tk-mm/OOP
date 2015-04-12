package ex14;

import java.io.*;

public class ReadDic {
	public static void main(String[] args){
		String filename = "dic.txt";
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
		}catch(FileNotFoundException e){
			System.out.println(filename + "が見つかりません。");
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
