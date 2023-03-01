package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.domain.Fruita;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.repository.FruitaRepository;
import jakarta.transaction.Transactional;

//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
//Recomiendo leer acerca de esta notación (es un mundo completo jeje) 
@Transactional
public class FruitaServiceImpl implements FruitaService{

	//Inyección de dependecias (crea una instancia cuando lo requiera)
	@Autowired
  	FruitaRepository fruitaRepository;

  	@Override
	public Fruita saveFruita(Fruita fruita) {
		return fruitaRepository.save(new Fruita(fruita.getNom(), fruita.getQuantitatQuilos()));
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
