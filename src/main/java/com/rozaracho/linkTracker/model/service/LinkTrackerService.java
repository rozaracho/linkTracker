package com.rozaracho.linkTracker.model.service;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.entity.Redirect;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import com.rozaracho.linkTracker.rest.dto.RedirectDto;

public interface LinkTrackerService {

    MaskedLinkDto save(String url);
    boolean redirect(String url);

    RedirectDto numberOfRedirects(String url);

    boolean invalidLink(String url);
}
