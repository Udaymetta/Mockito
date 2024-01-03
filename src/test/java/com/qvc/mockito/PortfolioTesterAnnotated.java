package com.qvc.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PortfolioTesterAnnotated {

	@InjectMocks
	Portfolio portfolio;
	
	@Mock
	StockService stockService;
	
	@SuppressWarnings("deprecation")
	@Test
	public void getStockvalue() {
		List<Stock> stocks = new ArrayList<Stock>();
		
		Stock tata = new Stock("1", "Tata", 10);
		Stock reliance = new Stock("2", "Reliance", 50);
		
		when(stockService.getPrice(tata)).thenReturn(100.0);
		when(stockService.getPrice(reliance)).thenReturn(1000.0);
		
		stocks.add(tata);
		stocks.add(reliance);
		portfolio.setStocks(stocks);
		
		double value = portfolio.getMarketValue();
		assertEquals(value, 51000.0);
		verify(stockService).getPrice(reliance);

	}
}
