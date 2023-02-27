package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.repository.FruitaRepository;

@Service
public class FruitaServiceImpl implements FruitaService{
	
	@Autowired
    private FruitaRepository fruitaRepository;
	
	@Override
	public Fruita saveFruita(Fruita fruita) {
		return fruitaRepository.save(fruita);
	}

	@Override
	public Fruita updateFruita(Fruita fruita) {
		
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
	public void deleteById(Long fruitaId) {
		fruitaRepository.deleteById(fruitaId);
	}

	@Override
	public Fruita getFruita(Long fruitaId) {
		
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
