package fatec_ipi_paoo_observer.src.br.com.bossini.fatec_ipi_paoo_observer;

import java.util.LinkedList;
import java.util.List;

public class LastStatsDisplay implements Observer {

	 LinkedList<Double> lista = new LinkedList<Double>();
	@Override
	
	public void update(double t, double c, double x) {
		
			lista.add(t);
			if(lista.size()>=10)
			{
		       System.out.println("Ultimos 10\n");
				
				for(Double l:lista)
				{
					System.out.printf("%.2f\n",l.doubleValue());
				}
				
				
				
				lista.remove(0);
			}
	}

}
