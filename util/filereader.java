package com.bridgelabz.datastructure.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereader {
	public static void main(String[] args) throws IOException {

		Object input;
		String a = "/home/admin-blz/Desktop/input.txt";
		String a1 = "/home/admin-blz/Desktop/output.txt";
		File file = new File(a);
		String data = "";

		FileReader fr = new FileReader(a);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			data = line;
			line = br.readLine();
		}
		br.close();
		fr.close();
		System.out.println(data);
		FileWriter fw = new FileWriter(a1);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(data);
	bw.flush();
	bw.close();
		 
	}

}
