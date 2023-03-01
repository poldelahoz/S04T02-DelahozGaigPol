package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.repository.FruitaRepository;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.repository.SequenceDao;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class FruitaServiceImpl implements FruitaService{
	
	private static final String FRUITA_SEQ_KEY = "fruita";
	
	@Autowired
	private SequenceDao sequenceDao;
	
	@Autowired
  	FruitaRepository fruitaRepository;

  	@Override
	public Fruita saveFruita(Fruita fruita) {
  		fruita.setId(sequenceDao.getNextSequenceId(FRUITA_SEQ_KEY));
		return fruitaRepository.save(fruita);
	}

	@Override
	public Fruita updateDepartment(Fruita fruita) {
		
		Optional<Fruita> fruitaData = fruitaRepository.findById(fruita.getId());
		
		if (fruitaData.isPresent()) {
			Fruita _fruita = fruitaData.get();
			_fruita.setNom(fruita.getNom());
			_fruita.setQuantitatQuilos(fruita.getQuantitatQuilos());
			return fruitaRepository.save(_fruita);
		}
		
		return null;
	}

	@Override
	public void deleteById(long fruitaId) {
		fruitaRepository.deleteById(fruitaId);
	}

	@Override
	public Fruita getFruita(long fruitaId) {
		
		Optional<Fruita> fruitaData = fruitaRepository.findById(fruitaId);
		
		if (fruitaData.isPresent())
			return fruitaData.get();
		else
			return null;
	}

	@Override
	public List<Fruita> getFruitaList() {
		return fruitaRepository.findAll();
	}
		
}
