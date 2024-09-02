package view;

import controller.ThreadsSoma;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		int [][]mat=new int[3][5];
		
		for (int x=0;x<3;x++)
		{
			for(int y=0;y<5;y++)
				{
					mat[x][y]=(int)((Math.random()*100)+1);
				}
			
		}
	
		System.out.println("Matriz:\n");
		
		for (int x=0;x<3;x++)
		{
			System.out.println("\n");
			for(int y=0;y<5;y++)
				{
				System.out.print(mat[x][y]+" ");
				}
			
		}
		System.out.println("\n");
		
		for (int x=0;x<3;x++)
			{	
				int [] vet=new int[5];
				for(int y=0;y<5;y++)
					{
						vet[y]=mat[x][y];
					}
			ThreadsSoma tS = new ThreadsSoma(vet,x+1);
			tS.start();
				}
			}
		
	}


