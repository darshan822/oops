package com.bridgeit.addressbook;
import java.util.List;

public interface AddressBook {//this method is declared in interface to avoid tight coupling .implentation given in implementation class for this method
	public List<Person> add();
	public void edit();
	public void remove() throws Exception;
	public void sortByName();
	public void sortByZip();
	public void printAll();
}
