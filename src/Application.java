import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Application.java
 * 
 * This class will test the contents of this second
 * programming project by determining if one input is
 * a subsequence of a second input string.
 * 
 *@author Jaylon Kiper
 * @version 2.0
 * Programming Project 2
 * FALL19
 */
public class Application {

	private static File file;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		//Character values to chose with method is to be run.
		char selection;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		/**
		 * Prints out boolean value to either read sequences
		 * by how they are typed or from a separate file.
		 */
		System.out.print("Would you like to enter sequences manually or from a file? (M/F): ");
			selection = scan.nextLine().charAt(0);
			
		StackInterface<Character> sequenceStack = new ArrayStack<>();
			
			char i = ' ';
			char[] stringSeq = (char[]) null;
			
	
		StackInterface<Character> subsequenceStack = new ArrayStack<>();
		
			char j = ' ';
			char stringSub[] = (char[]) null;
			
		/**
		 * If manually chosen or yes is chosen, the first and second sequences will
		 * be entered separately, pushed onto a stack by each character,
		 * then popped off,while matching each character.
		 */
		if(selection == 'M') {
			while(selection == 'M' || selection == 'Y') {
			//Reads first sequence.
			System.out.println("Enter the first sequence:  ");
				String subsequence1 = scan.nextLine();
			//Reads second sequence.
			System.out.println("Enter the second sequence:  ");
				String sequence1 = scan.nextLine();
			String tempSub = subsequence1;
			String tempSeq = sequence1;
					for(j = 0; j < tempSub.length();j++) {
						subsequenceStack.push((char)stringSub[tempSub.length()]);
					for(i = 0; i < tempSeq.length();i++)
						sequenceStack.push((char)stringSeq[tempSeq.length()]);
					}//end push for loop
							if(tempSub.charAt(j) == tempSeq.charAt(i)) {
								System.out.println(subsequence1 +" is a SUBSEQUENCE of "+ sequence1);
								}//end if
							else if(tempSub.charAt(j) != tempSeq.charAt(i)) {
								System.out.println(subsequence1 +" is not a SUBSEQUENCE of "+ sequence1);
								}//end else if
					System.out.println("Would you like to enter more sequences? (Y/N):");
						selection = scan.nextLine().charAt(0);	
		         }//end while
			}//end if M
		/**
		 * Reads sequences by file name using a FileReader.
		 */
		else if(selection == 'F'){
			file = new File("sequences.txt");
			System.out.print("Enter the name of the file to process:  ");
				String file1 = scan.nextLine();
			try(Reader fileReader = new FileReader("\\SequencesJLK\\src\\sequences.txt")){
				int charRead = -1;
				while ((charRead = fileReader.read()) != -1) {
					System.out.print((char) charRead);
					}//end while
				}//end try
				catch (FileNotFoundException ex) {
					System.err.println("File not found error: " + ex);
				}//end catch
				catch (IOException ex) {
					System.err.println("I/O error: " + ex);
				}//end catch
			}//end else if F
		
		 /**
		  *Ends the run of the program all together. 
		  */
		
		else{
			System.out.print("<END RUN>");
		}//end run
		
	}//end main
}//end class
