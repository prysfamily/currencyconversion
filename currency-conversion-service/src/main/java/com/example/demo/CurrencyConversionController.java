package com.example.demo;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/ quantity/{quantity}") //where {from} and {to} represents the column   
	//return a bean back  
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)  
	{  
	return new CurrencyConversionBean(1L, from,to,BigDecimal.ONE, quantity,quantity,0 );  
	}
	
	@GetMapping("/hi") //where {from} and {to} represents the column   
	//return a bean back  
	public String()  
	{  
	return "Hi";;  
	}
}
