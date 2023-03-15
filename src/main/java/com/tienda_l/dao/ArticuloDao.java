
package com.tienda_l.dao;

import com.tienda_l.domain.Articulo;
import com.tienda_l.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
    
}