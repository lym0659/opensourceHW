import java.util.*;
public class abc {

	public static void main(String[] args) {
		
		

		
		    String correct_pw = "hyin";
		    String input_pw;
		    
		    Scanner scan = new Scanner(System.in);
		    
		    
		    int i = 1;
		    
		    
		    while (i < 5) {
		      System.out.println("��ȣ�� �Է��ϼ���.");
		      input_pw = scan.nextLine();
		      if (input_pw.equals(correct_pw)) {
		        System.out.println("ȯ���մϴ�.");
		        break;
		      }
		      else {
		        i++;
		        System.out.println("��ȣ�� Ʋ���ϴ�.");
		      }
		      while (i == 5) {
		        System.out.println("������ �ź��մϴ�.");
		        break;
		      }    
		    }
		  
		
	}

}
