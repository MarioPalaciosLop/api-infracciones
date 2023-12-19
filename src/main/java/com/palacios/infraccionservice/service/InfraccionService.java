package com.palacios.infraccionservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.palacios.infraccionservice.entity.Infraccion;

public interface InfraccionService {

    public List<Infraccion> findAll(Pageable page);

    public List<Infraccion> findByNombre(String nombre, Pageable page);

    public Infraccion findById(int id);

    public Infraccion save(Infraccion empresa);

    public Infraccion update(Infraccion empresa);

    public void delete(int id);

}
