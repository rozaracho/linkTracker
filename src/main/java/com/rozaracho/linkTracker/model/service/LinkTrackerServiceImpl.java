package com.rozaracho.linkTracker.model.service;

import com.rozaracho.linkTracker.model.dao.MaskedLinkDao;
import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.helper.MaskedLinkFactory;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkTrackerServiceImpl implements LinkTrackerService {
    @Autowired
    MaskedLinkDao maskedLinkDao;
    @Autowired
    MaskedLinkFactory factory;

    @Override
    public MaskedLinkDto save(String url) {

        return factory.getMaskedLinkDto(maskedLinkDao.save(factory.getMaskedLink(url)));
    }
}
