package com.finanzas.trabajofinal.repositories;

import com.finanzas.trabajofinal.entities.Bono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BonoRepository  extends JpaRepository<Bono,Long> {
    @Query(value="select * from bono b where b.id=?1",nativeQuery = true)
    Bono findBonoById(Long id);
}
