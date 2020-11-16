package com.rozaracho.linkTracker.model.dao;

import com.rozaracho.linkTracker.model.entity.Redirect;
import org.springframework.data.repository.CrudRepository;

public interface RedirectDao extends CrudRepository<Redirect, Integer> {
}
