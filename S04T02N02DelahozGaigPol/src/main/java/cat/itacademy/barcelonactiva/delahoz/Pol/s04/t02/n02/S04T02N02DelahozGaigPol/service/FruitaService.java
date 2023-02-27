package cat.itacademy.barcelonactiva.delahoz.Pol.s04.t02.n02.S04T02N02DelahozGaigPol.service;

import java.util.List;

import cat.itacademy.barcelonactiva.delahoz.Pol.s04.t02.n02.S04T02N02DelahozGaigPol.domain.Fruita;

public interface FruitaService {
	
    Fruita saveFruita(Fruita fruita);
  
    Fruita updateDepartment(Fruita fruita);
  
    void deleteById(Long fruitaId);
  
    Fruita getFruita(Long fruitaId);
  
    List<Fruita> getFruitaList();
    
}
