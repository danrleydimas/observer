package fatec_ipi_paoo_observer.src.br.com.bossini.fatec_ipi_paoo_observer;

public class TesteEstacaoMonitoramento {
    public static void main(String[] args) {
    	WeatherData estacaoMonitoramento = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
        StatsDisplay sd = new StatsDisplay();
        ForecastDisplay fd = new ForecastDisplay();
        LastTenDisplay ltd = new LastTenDisplay();
        LastStatsDisplay lsd = new LastStatsDisplay(); 
        
        
        estacaoMonitoramento.addObserver(ccd);
        estacaoMonitoramento.addObserver(sd);
        estacaoMonitoramento.addObserver(fd);
        estacaoMonitoramento.addObserver(ltd);
        estacaoMonitoramento.addObserver(lsd);
        estacaoMonitoramento.iniciar();
	}
	
	
}
