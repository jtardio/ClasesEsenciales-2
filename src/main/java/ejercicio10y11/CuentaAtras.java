package ejercicio10y11;

public class CuentaAtras implements Runnable{
	
	private String id;
	private int num;
	private static String ultimaEscritura;
	
	CuentaAtras(String id, int num){
		this.id=id;
		this.num=num;
	}
		
		public void run(){
			
		    for(int i=num;i>=0;i--){
		        synchronized(this) {
		      	  
		      	System.out.println(id + " " + i + " El número de threads activos es "+Thread.activeCount() + " Ultima escritura: " + this.ultimaEscritura);
		      	this.ultimaEscritura = id;
		        }
		        
		        
		        try {
		        	Thread.sleep(1000);
		  	} catch (InterruptedException e) {
		  		// TODO Auto-generated catch block
		  		e.printStackTrace();
		  	} 
		    }
		    }

	

}
