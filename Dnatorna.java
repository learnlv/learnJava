import java.util.Scanner;

/* 
Given: A DNA string t having length at most 1000 nt.
Return: The transcribed RNA string of t.
Sample Dataset
GATGGAACTTGACTACGTAAATT
Sample Output
GAUGGAACUUGACUACGUAAAUU
*/
public class Dnatorna {
	public static void main(String[] args){		
		System.out.println("DNA into RNA program.");		
		//input DNA string 
		System.out.println("Please enter the DNA string:");
		Scanner input = new Scanner(System.in);
		System.out.print("DNA: ");
		String dna = input.next();
		input.close();		
		
		//Convert dna into rna
		String rna = "";
		int Len = dna.length();
		for(int i=0; i<Len; i++){
			if(dna.charAt(i)=='T') rna += 'U';
			else rna += dna.charAt(i);			
		}
		System.out.println("RNA: " + rna);
	}
}
