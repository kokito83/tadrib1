package com.greta94.PFMP.dao;

import com.greta94.PFMP.domain.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Projet PFPM
 * Pour GRETA 94
 * <p>
 * Créé le  02/02/2018.
 *
 * @author ENNACIRI Mounir
 */
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
    List<Entreprise> findAllByOrderByIdAsc();

}
