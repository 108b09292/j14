package hw07;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hw07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		int count=0;
		FileReader fr=new FileReader("D:\\物件導向\\donkey.txt");
		BufferedReader bfr=new BufferedReader(fr);
		while ((str=bfr.readLine())!=null) {
			if(count==1) { //正在讀第二列
				bfr.skip(14);
			}
			System.out.println(str);
			count++ ;
		}
		fr.close();
	}
}
