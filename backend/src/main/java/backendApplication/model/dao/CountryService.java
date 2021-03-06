package backendApplication.model.dao;

import backendApplication.model.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class CountryService {
    @Autowired
    CountryRepository repo;

    public void save(Country admin) {
        repo.save(admin);
    }

    public List<Country> listAll() {
        return (List<Country>) repo.findAll();
    }

    public Country get(Integer id) throws NoSuchElementException {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

