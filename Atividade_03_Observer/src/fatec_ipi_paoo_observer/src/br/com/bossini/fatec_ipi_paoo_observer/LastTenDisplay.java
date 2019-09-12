package fatec_ipi_paoo_observer.src.br.com.bossini.fatec_ipi_paoo_observer;

import java.util.LinkedList;

public class LastTenDisplay implements Observer {

	
	 LinkedList<Double> lista = new LinkedList<Double>();
	//= new List<double>();
	
	@Override
	public void update(double t, double h, double p) {
		lista.add(t);
		if(lista.size()>=10)
		{
			double media = 0;
			
			for(Double l:lista)
			{
				media += l.doubleValue();
			}
			media /= 10;
			
			System.out.printf("Média das ultimas 10 temperaturas = %.2f\n",media);
			lista.remove(0);
		}
		

	}

}
