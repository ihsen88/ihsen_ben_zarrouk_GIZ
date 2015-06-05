import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.*;


public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	//belongs to the matrix
	public static boolean Valid(ArrayList<Integer>   tab){
		boolean res=true;
		
		 for(int i=0;  i<tab.size();i++)
	       {
	       	if(tab.get(i)==-1) res=false;
	       }
		
		
		 return res;
		
		
		
	}
	
	//move North
	
	
	public static ArrayList<Integer> North(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		int dep=x-1;
		if((dep>0)&&(dep<3))
		res.add(dep);
		else
			res.add(-1);
		res.add(y);
		return res;
		
	}
	//move East
	public static ArrayList<Integer> East(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(x);
		int dep=y-1;
		if((dep>0)&&(dep<3))
		res.add(dep);
		else
			res.add(-1);
		
		return res;
		
	}
	//move South
	public static ArrayList<Integer> South(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		int dep=x+1;
		if(dep<3)
		res.add(dep);
		else
			res.add(-1);
		res.add(y);
		return res;
		
	}
	//move west
	public static ArrayList<Integer> West(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(x);
		int dep=y+1;
		if(dep<3)
		res.add(dep);
		else
			res.add(-1);
		
		return res;
		
	}
	

	public static void main(String[] args) {
		
		int starting_position_x=-1;
		int starting_position_y=-1;
		
		int  new_position_x;
		
		int  new_position_y;
		// maze
		char matrice [][]= {{'#', '#', '#'}, 
				{'@', '.', '.'}, 
				{'#', '#', 'x'}}; 
				for(int i=0; i<3; i++){ 
				for(int j = 0; j < 3; j++){ 
				System.out.println(matrice[i][j]); 
				} 
				} 
				
				
				System.out.println("*********** Maze  **********************");
				System.out.println("# # #");
				System.out.println("@ . .");
				System.out.println("# # x");
				
				//find starting position
				
				for(int i=0; i<3; i++){ 
					for(int j = 0; j < 3; j++){ 
						
						if(matrice[i][j]=='@') {
							starting_position_x=i;
							starting_position_y=j;
						}
						
						  
					}}
				System.out.println("starting_position_x   "+starting_position_x);
				System.out.println("starting_position_y    "+starting_position_y);
				
				new_position_x=starting_position_x;
		        new_position_y=starting_position_y;
				
		        //read keyboard input
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your trip  ******* move North enter  N or  n  \n ******    move South enter S or s \n ******    move East enter E or e \n ******    move West enter w  or W  ");
				
				String str = sc.nextLine();
				System.out.println("You typed: " + str);
				
				
				// List for path
				ArrayList<Integer> path = new ArrayList<Integer>();
				
				
				
				while(str.equals("")!=true){

				if((str.equals("N")==true)||(str.equals("n")==true)){
				
				ArrayList<Integer> res=North(new_position_x, new_position_y);
				if(Valid(res)==true){
					
					
					new_position_x=res.get(0);
					
					new_position_y=res.get(1);
					
					path.add(new_position_x);
					path.add(new_position_y);
					
					
				}else  if(Valid(res)==false){
					
					System.out.println(" in case the move is not valid ");
					
				}
				
				
				
				
				}
				if((str.equals("S")==true)||(str.equals("s")==true)){
					
					ArrayList<Integer> res=South(new_position_x, new_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						path.add(new_position_x);
						path.add(new_position_y);
						
						
					}		
				else  if(Valid(res)==false){
					
					System.out.println(" in case the move is not valid ");
					
				}
					
					
					
					
					
					}
				if((str.equals("E")==true)||(str.equals("e")==true)){
					
					ArrayList<Integer> res=East(new_position_x, new_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						path.add(new_position_x);
						path.add(new_position_y);
						
						
					}else  if(Valid(res)==false){
						
						System.out.println(" in case the move is not valid ");
						
					}
					
					
					
					
					}
				
				
				
				
				
				if((str.equals("W")==true)||(str.equals("w")==true)){
					
					ArrayList<Integer> res=West(new_position_x, new_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						path.add(new_position_x);
						path.add(new_position_y);
						
						
					}else  if(Valid(res)==false){
						
						System.out.println(" in case the move is not valid ");
						
					}
					
					
					
					
					}
				
				
				//test if this is the exit or not
				if(matrice[new_position_x][new_position_y]=='x'){System.out.println("done , you find its way");
				break;}
				
				//new enter
				System.out.println("choose your trip  ******* move North enter  N  or  n \n ******    move South enter S or s \n ******    move East enter E or e \n ******    move West enter w  or W  ");
				
				 str = sc.nextLine();
				System.out.println("You new typed : " + str);
				
				
				
				
				
				
				
				}
				
				System.out.println("***************the  path is***************************");
				int i=0;
				while(i<path.size()){
					System.out.println("the coordinate of the box  ( "+path.get(i)+" , "+path.get(i+1)+"  ) \n");
					i=i+2;
					
				}
				
	}

}
