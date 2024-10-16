package com.voluntrix.Voluntrix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voluntrix.Voluntrix.model.VoluntarioModel;

@Repository
public interface VoluntarioRepository extends JpaRepository<VoluntarioModel, Long>{

}
