package question1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCounterFeitClass {

	
	private List<String> serialNumbers;
	private int totalMoneyValue;
	
	public CountCounterFeitClass(List<String> serialNumbers) {
		this.serialNumbers = serialNumbers;
		this.totalMoneyValue = 0;
	}
	
	
	/**
	 * Call this function from the consumer. This is entry point
	 * @return
	 */
	public int countCounterFeit() {
		for(String serialNumber : serialNumbers) 
			if(validateLengthOfSerialNumber(serialNumber)) 
				if(validateStartingThreeDistinctCapitalAlphabet(serialNumber)) 
					if(validateYear(serialNumber)) 
						if(validateEndOfSerialNumberWithCapitalLetter(serialNumber))
							totalMoneyValue = totalMoneyValue + getMoneyValue(serialNumber);
		return totalMoneyValue;
	}
	
	/**
	 * Length must be between 10 - 12 characters
	 * @return
	 */
	private boolean validateLengthOfSerialNumber(String serialNumber) {
		int serialLength =  serialNumber.length();
		if(serialLength >= 10 && serialLength<=12) 
			return true;
		return false;
	}
	
	/**
	 * First 3 characters must be distinct uppercase  letters
	 * @return
	 */
	private boolean validateStartingThreeDistinctCapitalAlphabet(String serialNumber) {
		String firstSubString =  serialNumber.substring(0, 3);
		if(checkStringHasDistinctCharacter(firstSubString) && checkStringHasOnlyCapitalCharacter(firstSubString))
			return true;
		return false;
	}
	
	private boolean checkStringHasDistinctCharacter(String subString) {
		Set<Character> set = new HashSet<Character>();
		 for (char ch : subString.toCharArray()) {
			 set.add(ch);
		 }
		 if(subString.length()==set.size())
			 return true;
		 return false;
	}
	
	private boolean checkStringHasOnlyCapitalCharacter(String string) {
		if(string.toUpperCase().equals(string))
			return true;
		return false;
	}
	
	/**
	 * Must be between 1900 and 2019 inclusive
	 * @return
	 */
	private boolean validateYear(String serialNumber) {
		String yearSubString =  serialNumber.substring(3, 7);
		if(checkTheStringHasOnlyNumbers(yearSubString)) {
			int year = Integer.parseInt(yearSubString);
			if(year<=2019 && year>=1900)
				return true;
			else
				return false;
		}else
			return false;
	}
	
	private boolean checkTheStringHasOnlyNumbers(String subString) {
		try {
			 Integer.parseInt(subString);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	/*
	 * Last digit must be an upperCase letter
	 */
	private boolean validateEndOfSerialNumberWithCapitalLetter(String serialNumber) {
		String lastCharater =  serialNumber.substring(getIndexOfLastCharacter(serialNumber));
		if(checkTheStringHasOnlyNumbers(lastCharater))
			return false;
		else {
			return checkStringHasOnlyCapitalCharacter(lastCharater);
		}
	}
	
	private int getIndexOfLastCharacter(String serialNumber) {
		return serialNumber.length()-1;
	}
	
	
	
	/**
	 * after year next digit {10,20,50,100,200,500,1000}
	 * @return
	 */
	private int getMoneyValue(String serialNumber) {
		List<Integer> availableCurrency = validCurrency();
		String currencyValue = serialNumber.substring(7, getIndexOfLastCharacter(serialNumber));
		try {
			int value =  Integer.valueOf(currencyValue);
			if(availableCurrency.contains(value)) {
				return value;
			}else
				return 0;
		}catch(NumberFormatException e) {
			return 0;
		}
	}
	
	/**
	 * Valid money bank
	 * @return
	 */
	private List<Integer> validCurrency(){
		List<Integer> availableCurrency = new ArrayList<Integer>();
		availableCurrency.add(10);
		availableCurrency.add(20);
		availableCurrency.add(50);
		availableCurrency.add(100);
		availableCurrency.add(200);
		availableCurrency.add(500);
		availableCurrency.add(1000);
		return availableCurrency;
	}
	
}
