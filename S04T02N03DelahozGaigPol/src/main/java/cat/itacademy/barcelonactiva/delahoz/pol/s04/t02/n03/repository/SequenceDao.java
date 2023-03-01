package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.repository;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.exception.SequenceException;

public interface SequenceDao {
	
	long getNextSequenceId(String key) throws SequenceException;
	
}
