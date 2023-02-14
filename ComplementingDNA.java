/*
 Given: A DNA string s of length at most 1000 bp.
 Return: The reverse complement sc of s.
 Sample Input :  AAAACCCGGT
 Sample Output:  ACCGGGTTTT
*/
import java.util.Scanner;
public class ComplementingDNA {
	public static void main(String[] args){		
		System.out.println("Complementing a Strand of DNA program.");		
		//input the original DNA strand
		System.out.println("Please input the original DNA strand:");
		Scanner input = new Scanner(System.in);
		System.out.print("original DNA: ");
		String oriDNA = input.next();
		input.close();
		
		//reverse the complement of dna strand
		String revs = "";
		int Len = oriDNA.length();
		for(int i=0; i<Len; i++){			
			if(oriDNA.charAt(i)=='A') revs = 'T' + revs;
			else if(oriDNA.charAt(i)=='T') revs = 'A' + revs;
			else if(oriDNA.charAt(i)=='G') revs = 'C' + revs;
			else revs = 'G' + revs;
		}
		System.out.println("Complement Strand: " + revs);		
	}
}
