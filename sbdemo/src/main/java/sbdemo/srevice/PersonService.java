package sbdemo.srevice;

import java.util.List;

import sbdemo.model.Person;

public interface PersonService {

	public void savePerson(Person person);
	
	public List<Person> getAllPerson();
	
}
