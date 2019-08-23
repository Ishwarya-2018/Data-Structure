package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructure.util.Utility;

public class Ordered {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Utility util=new Utility();
		boolean check;
		String address = "/home/admin-blz/Desktop/input1.txt";
		String address1 = "/home/admin-blz/Desktop/output1.txt";
		String data = "";

		try {
			FileReader fr = new FileReader(address);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine(); // to read a whole line
			while (line != null) {
				data += line;
				// System.out.println("inside while "+data);
				line = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("exception catched in catch");
		}

		String[] num = data.split(" ");

		for (int i = 0; i < num.length; i++) {
			util.ll1.add(num[i]);
			// System.out.println("in split "+num[i]);
		}
		System.out.println("the elements in the list are");
		util.ll1.show();
		System.out.println("enter key to search");
		String key = scan.next();
		check = util.ll1.search(key);

		if (check == true) {
			util.ll1.delete(key); // if it present it must be deleted

		} else {
			util.ll1.add(key); // if it not exist it must be added
		}
		util.ll1.show();
		scan.close();

		util.ll1.writeToFile(address1);
	}

}
