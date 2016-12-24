package com.template;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.template.soap.dto.CreditCardApplication;
import com.template.soap.dto.CreditCardInformation;

@WebService
public interface BankAccount {
	
	@WebMethod
	public @WebResult CreditCardInformation newApplication(@WebParam CreditCardApplication creditCardApplication);
	
}
