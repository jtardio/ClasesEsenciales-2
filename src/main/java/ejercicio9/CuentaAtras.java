package ejercicio9;

public class CuentaAtras extends Thread{
	
	private String id;
	private int num;
	
	CuentaAtras(String id, int num){
		this.id=id;
		this.num=num;
	}
		
		public void run(){
			 while (num >= 0) {
					System.out.println(id + " - " + num);
					--num;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
		    }

	

}
