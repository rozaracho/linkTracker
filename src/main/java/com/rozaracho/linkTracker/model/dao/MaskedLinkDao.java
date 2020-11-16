package com.rozaracho.linkTracker.model.dao;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import org.springframework.data.repository.CrudRepository;

public interface MaskedLinkDao extends CrudRepository<MaskedLink, Integer> {
}
