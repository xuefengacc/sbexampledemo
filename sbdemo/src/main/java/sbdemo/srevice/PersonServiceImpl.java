package sbdemo.srevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbdemo.model.Person;
import sbdemo.repository.PersonRepo;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	protected PersonRepo perRepo;

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		perRepo.save(person);
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return (List<Person>)perRepo.findAll();
	}
	
}
