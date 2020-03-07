package sbdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sbdemo.model.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long>{

	/*
	 * count() return long
	 * delete(T entity) 
	 * deleteAll()
	 * deleteAll(Iterable<? extends T> entites)
	 * deleteById(ID id)
	 * existsById(ID id) return boolean
	 * findAll() Iterable<T>
	 * findAllById(Iterable<ID> ids) return Iterable<T>
	 * findById(ID id) Optional<T>
	 * save(S entity) return <S extends T> S
	 * saveAll(Iterable<S> entities) return Iterable S
	 * 
	 * */
	
}
