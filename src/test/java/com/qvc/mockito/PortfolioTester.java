package com.qvc.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTester {

	Portfolio portfolio;
	StockService stockService;
	
	public static void main(String[] args) {
		PortfolioTester portfolioTester = new PortfolioTester();
		portfolioTester.setUp();
		System.out.println(portfolioTester.getStockvalue()?"pass":"fail");
	}
	
	public void setUp() {
		portfolio = new Portfolio();
		stockService = mock(StockService.class);
		portfolio.setStockService(stockService);
	}
	

	public boolean getStockvalue() {
		List<Stock> stocks = new ArrayList<>();
		
		Stock tata = new Stock("1", "Tata", 10);
		Stock reliance = new Stock("2", "Reliance", 50);
		
		when(stockService.getPrice(tata)).thenReturn(100.0);
		when(stockService.getPrice(reliance)).thenReturn(1000.0);
		
		stocks.add(tata);
		stocks.add(reliance);
		portfolio.setStocks(stocks);

		double value = portfolio.getMarketValue();
		verify(stockService).getPrice(reliance);
		return value == 51000.0;
	}
}
