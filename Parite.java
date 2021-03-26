package tableauPairIMPair;

public class Parite {

	public static void main(String[] args) {
		int j=0,k=0;
		int []tab= {12,23,34,9,89,22,12,31,90,11};
        
        int []pair=new int[tab.length/2];
        int []impair=new int[tab.length/2];
       for (int i=0;i<tab.length;i++) {
		if (tab[i]%2==0) { 
	     pair[j]=tab[i];
		j++;
		}
		if (tab[i]%2==1) {
		impair[k]=tab[i];
				k++;
		}		
	  }System.out.println("les nombres impair sont:");
       for (int i=0;i<impair.length;i++) {
    	   
		System.out.print(impair[i]+" ");
	}
       System.out.println();
       System.out.println("les nombres pair sont:");
       for (int i=0;i<pair.length;i++) {
    	   
   		System.out.print(pair[i]+" ");
   	}
      
	}
}
