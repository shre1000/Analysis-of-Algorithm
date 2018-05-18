
import java.util.*;

public class editdistance{
	 static String[][] main_op;

public double calculation(String[][] op,String s1, String s2){

        double [][] solution = new double[s1.length()+1][s2.length()+1];//matix for cost calculation
        
        for (int i = 0; i <=s2.length(); i++) {
           solution[0][i] =i*1;
           op[0][i]="insert";//op is matrix for tracking back operations
        }

        for (int i = 0; i <=s1.length(); i++) {
            solution[i][0] =i*1;
            op[i][0]="delete";
        }

        int m = s1.length();
        int n = s2.length();

        for (int i = 1; i <=m ; i++) {
            
        	for (int j = 1; j <=n ; j++) {

                if(s1.charAt(i-1)==s2.charAt(j-1)){

                    solution[i][j] = solution[i-1][j-1] + 0;//copy
                    
                    op[i][j]="copy";
                   
                    
                }

                else if(s1.charAt(i-1)!=s2.charAt(j-1)){ 

                	double replace = solution[i-1][j-1] + 2; // replace
    			    double insert = solution[i][j - 1] + 1; //insert
    				double delete = solution[i-1][j] + 1; //delete
    				
    				double min;
    				
    				if(replace>insert){
    					min=insert;
    					op[i][j]="insert";
    					solution[i][j] = min;
    				}
    				else{
    					min=replace;
    				    op[i][j] = "replace";
    				    solution[i][j] = min;
                }
    				 if(min>delete){
    					 min = delete;
    					 op[i][j]="delete";
    					 solution[i][j] = min;
    				 }
    					
    			
                }   
                
    				if(i>1 && j>1 && s1.charAt(i-1) == s2.charAt(j-2)&& s1.charAt(i-2)== s2.charAt(j-1) && (solution[i-2][j-2]+1.5)<solution[i][j]){
    					  solution[i][j]=solution[i-2][j-2]+1.5;
    					  op[i][j]="twiddle";
    			 }
             
                
        }//end of j for loop

    }//end of i for loop
        
        for(int i=0; i<=m-1;i++){
        	if((solution[i][n]+5)<solution[m][n]){
        		solution[m][n]=solution[i][n]+5;
        		op[m][n]="kill "+ (i+1);//kill
        		//in sample solution kill 3 is output so it will kill source string from g which is at 3(a at 1, l at 2, g at 3).
        		//so adding 1 to get that
        	}
        }
       
        System.out.println("sequence of operations: ");
        
        editdistance ed1 = new editdistance();
        ed1.opseq(op, s1.length(), s2.length());//to print sequence
        
        return solution[m][n];//return cost
        
        
        
        
        
}
public void opseq(String[][]dop,int o,int p){
	int o1=0;
	int p1=0;
	if(o==0 && p==0)
		return;
	if(dop[o][p]=="copy"|| dop[o][p]=="replace"){
		o1=o-1;
		p1=p-1;	
	}
	else if(dop[o][p]=="twiddle"){

		o1=o-2;
		p1=p-2;
	}
	else if(dop[o][p]=="delete"){

		o1=o-1;
		p1=p;	
	}
	else if(dop[o][p]=="insert"){
		o1=o;
		p1=p-1;
	}
	else {
		try{
		StringTokenizer st1 = new StringTokenizer(dop[o][p]);
	    st1.nextToken();
	    String k = st1.nextToken();
	    int k1 = Integer.parseInt(k);
	    k1=k1-1;
	    o1=k1;
	    p1=p;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		}
	
opseq(dop,o1,p1);
System.out.println(dop[o][p]);
	
}

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter first string");
    	String one = scan.nextLine();
    	int m = one.length();
    	
    	System.out.println("Enter second string");
    	String two = scan.nextLine();
int n = two.length();

        editdistance ed = new editdistance();
        String[][] main_op = new String[one.length()+1][two.length()+1];

       
        
        double result= ed.calculation(main_op,one, two);
        System.out.println("optimal cost is : " + result);
        
     

        scan.close();

    }

}


