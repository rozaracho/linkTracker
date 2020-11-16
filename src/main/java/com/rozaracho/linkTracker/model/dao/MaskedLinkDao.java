package com.rozaracho.linkTracker.model.dao;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface MaskedLinkDao extends CrudRepository<MaskedLink, Integer> {
    Optional<MaskedLink> findByLink(String link);
}
