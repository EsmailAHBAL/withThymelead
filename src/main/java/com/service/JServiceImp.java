package com.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;



@Service
public class JServiceImp implements JServiceInt {
     private ChuckNorrisQuotes  chuckNorrisQuotes;
     
     public JServiceImp()
     {
    	 this.chuckNorrisQuotes = new ChuckNorrisQuotes();
     }
	public String getJokes()
	{
		return chuckNorrisQuotes.getRandomQuote();
	}
}
