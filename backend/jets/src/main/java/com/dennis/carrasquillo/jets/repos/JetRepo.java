package com.dennis.carrasquillo.jets.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dennis.carrasquillo.jets.entities.Jet;

/**
 * CRUD Repository for {@link Jet}
 * @author dennis carrasquillo
 *
 */
@Repository
public interface JetRepo extends JpaRepository<Jet, Integer> {

}
