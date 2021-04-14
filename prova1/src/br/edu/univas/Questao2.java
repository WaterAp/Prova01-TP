package br.edu.univas;

public class Questao2 {

	public static void main(String[] args) {
		
		int v1;
		int v2, v3;
		int atual = 2021;
		int funciona1, funciona2, funciona3;
		int funciona4, funciona5, funciona6; 
		
		v1 = 50;
		v2 = 10;
		v3 = 40;
		
		
	  //VERIFICACAO SE A VIAGEM FUNCIONA
	  funciona1 = atual - v1 - v2 + v3; 
	  funciona2 = atual - v2 - v3 + v1; 
	  funciona3 = atual - v1 - v3 + v2; 
	 
	  
	  funciona4 = atual - v1 + v2;
	  funciona5 = atual - v3 + v1;
	  funciona6 = atual - v2 + v3;
	  
	  
	  
	  //3?
	  if (funciona1 == 2021) {
		  System.out.println("Sim, é possivel fazer essa viagem!");
	  } else {
		  System.out.println("Não, é possivel fazer essa viagem!");
	  
		  if (funciona2 == 2021) {
			  System.out.println("Sim, é possivel fazer essa viagem!");
		  } else {
			  System.out.println("Não, é possivel fazer essa viagem!");
		  
			  if (funciona3 == 2021) {
				  System.out.println("Sim, é possivel fazer essa viagem!");
			  } else {
				  System.out.println("Não, é possivel fazer essa viagem!");
  
			  
			  }
		  
		  }
	  
	  }
		
	  //2?
	  if (funciona4 == 2021) {
		  System.out.println("Sim, é possivel fazer essa viagem!");
	  } else {
		  System.out.println("Não, é possivel fazer essa viagem!");
	  
		  if (funciona5 == 2021) {
			  System.out.println("Sim, é possivel fazer essa viagem!");
		  } else {
			  System.out.println("Não, é possivel fazer essa viagem!");
		  
			  if (funciona6 == 2021) {
				  System.out.println("Sim, é possivel fazer essa viagem!");
			  } else {
				  System.out.println("Não, é possivel fazer essa viagem!");
			  
			  
			  
			  }
		  
		  }
	  
	  }
		
	  
	  //(T__T) PERTGUNTA ME BUGO, saiu errado.
		
		
		
		
	}
}



