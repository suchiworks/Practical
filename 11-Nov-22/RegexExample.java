package prac11Nov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		//three way to represent pattern & match
		//1st way
		Pattern p = Pattern.compile(".a");//single dot represent single character
		//compile regular express into pattern
		Matcher m = p.matcher("ma");//a.dot represent single char m
		boolean b = m.matches();//output for b//true


		//2nd way
		boolean bb = Pattern.compile("..m").matcher("aam").matches();//false/true output for bb//true

		//3rdway
		boolean b1=java.util.regex.Pattern.matches(".a", "sa");//true
		System.out.println(b+" "+bb+" "+b1);//true
			}

		}

