package com.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.app.model.Uom;

public interface IUomService {

	public long save(Uom uom);
	public void update(Uom uom);
	public void deleteById(long uomId);
	
	public Uom getOneById(long uomId);
	public List<Uom> getAll();
	public Page<Uom> getAll(Specification<Uom> s,Pageable pageable);
	
	public List<Uom> saveMultiple(List<Uom> uomList);
	public boolean isUomTypeNModelExist(Uom uom);
}
