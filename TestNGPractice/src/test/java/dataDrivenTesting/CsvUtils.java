package dataDrivenTesting;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class CsvUtils {

	public static Object[][] getTableArray(String filePath) throws IOException{
		Object[][] tabArray = null;
		
		
		List<List<Object>> list = new ArrayList<List<Object>>();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = br.readLine();
		Object[] cells = line.split(",");
		
		for(Object cell : cells) {
			List<Object> subList = new ArrayList<Object>();
			subList.add(cell);
			list.add(subList);
		}
		
		while((line = br.readLine()) != null) {
			Object[] elems = line.split(",");
			for(int i = 0; i < elems.length; i++) {
				list.get(i).add(elems[i]);
			}
		}
		br.close();
		
		int rows = list.size();
		int cols = list.get(0).size();
		
		tabArray = new Object[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				tabArray[i][j]=list.get(j).get(i);
			}
		}
		
		return tabArray;
	}
	
	
}
