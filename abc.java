import java.util.*;
public class abc {

	public static void main(String[] args) {
		
		

		
		    String correct_pw = "hyin";
		    String input_pw;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    
		    int i = 1;
		    
		    
		    while (i < 5) {
		      System.out.println("암호를 입력하세요.");
		      input_pw = scan.nextLine();
		      if (input_pw.equals(correct_pw)) {
		        System.out.println("환영합니다.");
		        break;
		      }
		      else {
		        i++;
		        System.out.println("암호가 틀립니다.");
		      }
		      while (i == 5) {
		        System.out.println("접속을 거부합니다.");
		        break;
		      }    
		    }
		  
		
	}

}
