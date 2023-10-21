package ex11;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Ex11  {
  public static void Racine() {
	  double r ;
	  int n ;
	  do {
		  Scanner p=new Scanner(System.in);
		  System.out.println("entrer un entier positif:");
		 n=p.nextInt();
		  if(n>0) {
		  r=sqrt(n);
		  System.out.println("la racine est :"+r);
		  }
		  else if(n<0) {
			 System.out.println("SVP positif") ;
		  }
		  }while( n!=0);
	  System.out.println("Au revoir") ;
	  
	  
	  
	  
  }
	public static void main(String[] args) {
			Racine();
			System.out.print("entrer un entier entre 0 et 4:");
	}

}
