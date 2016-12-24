package com.template.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardInformation {
	
	@XmlElement(name="holderName")
	String firstName;
	
	@XmlElement(name="holderLast")
	String lastName;
	
	@XmlElement(name="cardNum")
	Long cardNumber;
	
	@XmlElement(name="secCode")
	int securityCode;
	
	@XmlElement(name="issue")
	String countryIssue;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getCountryIssue() {
		return countryIssue;
	}

	public void setCountryIssue(String countryIssue) {
		this.countryIssue = countryIssue;
	}
	
	
}
