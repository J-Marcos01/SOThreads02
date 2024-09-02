package controller;
/*
 * 2) Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 
chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha, 
imprimindo a identificação da linha e o resultado da soma.
Dica: A main deve gerar uma matriz com números aleatórios, mas a Thread recebe um vetor 
(uma linha da matriz
*/
public class ThreadsSoma  extends Thread
{
	private int [] vet=new int[5];
	private int linha;
	
	public  ThreadsSoma(int []vet,int linha)
	{
		this.vet=vet;
		this.linha=linha;				
	}
	public void run()
	{
		somaN();
	}
	private void somaN()
	{
		int soma=0;
		for(int i=0;i<5;i++)
		{			
		soma=soma+vet[i];
		
		}
		
		System.out.println("Linha "+linha+  "soma ="+soma);
			
	}
	
}
