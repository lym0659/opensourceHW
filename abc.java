import java.util.*;
public class abc {

	public static void main(String[] args) {
		
	

		
		    String correct_pw = "hyin"; // 真真 真
		    String input_pw;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    
	    int i = 0;
		   
		    
		    while (i < 4) {
		      System.out.println("真真� 真真�:");
		      input_pw = scan.nextLine();
		      if (input_pw.equals(correct_pw)) {
		        System.out.println("真真� :)");
		        break;
		      }
		      else {
		        i++;
		        System.out.println("真� 真真真�.");
		      }
		      while (i == 4) {
		        System.out.println("真� 真真�.");
		        break;
		      }    
		    }
		  
		
	}

}
