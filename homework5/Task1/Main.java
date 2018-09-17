
public class Main {
	
public static void main(String[] args) {
	
	Bird[] birds = new Bird[20];
	
	for(int i = 0; i<birds.length; i++) {
		
		 if(i<5) {
			 birds[i] = new Eagle();
		 }
		 
		 else if( (i>=5) && (i<10) ) {
			 
			 birds[i] = new Swallow();
		 }		
		 
		 else if ((i>=10)&&(i<15)) {
			 
			 birds[i] = new Swallow();
			 
		 }
		 
		 else {  birds[i] = new Kiwi(); }
	}
	
	
	for(int a = 0; a<birds.length; a++) {
		
		birds[a].Attributes();
		birds[a].fly();
	}
}
}
