package test;

import java.util.ArrayList;

public class HijoDeAlgo {
	private ArrayList<String> hijos;

	public HijoDeAlgo(ArrayList<String> hijos) {
//		super();
		hijos = new ArrayList<String>();
	}
	
	public void addElemento(String s) {
		int pos=0;
		while(pos<hijos.size() && hijos.get(pos).compareTo(s)<0) {
			pos++;
		}
		hijos.add(pos, s);
	}
	


}
