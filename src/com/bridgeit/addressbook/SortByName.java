package com.bridgeit.addressbook;
import java.util.Comparator;

public class SortByName implements Comparator<Person> {// to sort address book based on name .comparator is used for customizd sort

	public int compare(Person personOne, Person personTwo) {
		if(personOne.getFirstName().equals(personTwo.getFirstName()))
			return 0;
		else {
			if(personOne.getFirstName().compareTo(personTwo.getFirstName())>0) {
				return 1;
			}else {
				return -1;
			}
		}
	}
}
