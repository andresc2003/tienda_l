
package com.tienda_l.dao;

import com.tienda_l.domain.Categoria;
import com.tienda_l.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long>{
    
    
}
