package hw04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hw04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char data[]=new char[120];
		FileReader fr=new FileReader("D:\\物件導向\\donkey.txt");
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("字元數="+num);
		System.out.println(str);

	}

}
