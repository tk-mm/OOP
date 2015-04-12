package ex14;

import java.io.*;
import java.util.ArrayList;

public class AddressBook {
	ArrayList<Address> book;
	public AddressBook(){
		book = new ArrayList<Address>();
	}
	public void add(Address address){
		book.add(address);
	}
	public void showAddress(){
		for(Address list: book){
			System.out.println(list.toString());	
		}
	}
	public void open(String filename){
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while((line = reader.readLine()) != null){
				String[] str = line.split(",");
				book.add(new Address(str[0], str[1], str[2], str[3]));
			}
		} catch (FileNotFoundException e){
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e){
			System.out.println(e);
		}
	}
	public void save(String filename){
		try{
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			for(Address list: book){
				writer.println(list.toString());	
			}
			writer.close();
		}catch (IOException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AddressBook book = new AddressBook();
	    System.out.println("ファイルから読み込む。");
	    book.open("address.txt");
	    System.out.println("一覧の表示。");
	    book.showAddress();
	    System.out.println("新規データの追加。");
	    Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
	    book.add( taroAddress );
	    System.out.println("一覧の表示。");
	    book.showAddress();
	    System.out.println("ファイルに書き出す。");
	    book.save("address2.txt");
	}

}
