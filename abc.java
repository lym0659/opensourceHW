import java.util.*;
public class abc {

	public static void main(String[] args) {
		
	

		
		    String correct_pw = "hyin"; // ¿¿¿¿ ¿¿
		    String input_pw;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    
	    int i = 0;
		   
		    
		    while (i < 4) {
		      System.out.println("¿¿¿¿¿ ¿¿¿¿¿:");
		      input_pw = scan.nextLine();
		      if (input_pw.equals(correct_pw)) {
		        System.out.println("¿¿¿¿¿ :)");
		        break;
		      }
		      else {
		        i++;
		        System.out.println("¿¿¿ ¿¿¿¿¿¿¿.");
		      }
		      while (i == 4) {
		        System.out.println("¿¿¿ ¿¿¿¿¿.");
		        break;
		      }    
		    }
		  
		
	}

}
