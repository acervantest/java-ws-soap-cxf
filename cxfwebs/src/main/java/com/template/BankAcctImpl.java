package com.template;

import com.template.soap.dto.CreditCardApplication;
import com.template.soap.dto.CreditCardInformation;

public class BankAcctImpl implements BankAccount{

	@Override
	public CreditCardInformation newApplication(CreditCardApplication creditCardApplication) {
		
		CreditCardInformation newCard = new CreditCardInformation();
		
		newCard.setFirstName(creditCardApplication.getName());
		newCard.setLastName(creditCardApplication.getLastname());
		newCard.setCardNumber((long) 123456789);
		newCard.setSecurityCode(1234);
		newCard.setCountryIssue(creditCardApplication.getCountry());
		
		return newCard;
	}

	

}
