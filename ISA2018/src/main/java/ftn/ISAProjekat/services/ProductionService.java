package ftn.ISAProjekat.services;

import java.util.Collection;

import ftn.ISAProjekat.model.Production;

public interface ProductionService {

	Collection<Production> findByIsMovie(boolean isMovie);

}