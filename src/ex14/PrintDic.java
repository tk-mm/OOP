package ex14;

import java.io.*;

public class PrintDic {
	public static void main(String[] args){
		String filename = "dic.txt";
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while((line = reader.readLine()) != null){
				String[] str = line.split(",");
				System.out.println("英単語[" + str[0] + "]は、日本語の[" + str[1] + "]という意味です。");
			}
			reader.close();
		}catch(FileNotFoundException e){
			System.out.println(filename + "が見つかりません。");
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
