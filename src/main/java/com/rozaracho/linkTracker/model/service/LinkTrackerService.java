package com.rozaracho.linkTracker.model.service;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;

public interface LinkTrackerService {
    public MaskedLinkDto save(String url);
}
