package com.rozaracho.linkTracker.model.service;

import com.rozaracho.linkTracker.model.dao.MaskedLinkDao;
import com.rozaracho.linkTracker.model.dao.RedirectDao;
import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.entity.Redirect;
import com.rozaracho.linkTracker.model.helper.MaskedLinkFactory;
import com.rozaracho.linkTracker.model.helper.RedirectFactory;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import com.rozaracho.linkTracker.rest.dto.RedirectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LinkTrackerServiceImpl implements LinkTrackerService {
    @Autowired
    MaskedLinkDao maskedLinkDao;

    @Autowired
    RedirectDao redirectDao;

    @Autowired
    MaskedLinkFactory maskedLinkFactory;

    @Autowired
    RedirectFactory redirectFactory;

    @Transactional
    @Override
    public MaskedLinkDto save(String url) {
        return maskedLinkFactory.getMaskedLinkDto(maskedLinkDao.save(maskedLinkFactory.getMaskedLink(url)));
    }
    @Transactional
    @Override
    public boolean redirect(String url) {
        MaskedLink maskedLink = maskedLinkDao.findByLink(url).orElse(null);
        if(maskedLink != null && maskedLink.getValid()){
            Redirect redirect = redirectFactory.getRedirect(maskedLink);
            redirectDao.save(redirect);
            return true;
        }
        return false;
    }

    @Override
    public RedirectDto numberOfRedirects(String url) {
        MaskedLink maskedLink = maskedLinkDao.findByLink(url).orElse(null);
        return redirectFactory.getRedirectDto(maskedLink.getRedirects().size());
    }

    @Transactional
    @Override
    public boolean invalidLink(String url) {
        MaskedLink maskedLink = maskedLinkDao.findByLink(url).orElse(null);
        if(maskedLink != null){
            maskedLink.setValid(false);
            maskedLinkDao.save(maskedLink);
            return true;
        }
        return false;
    }
}
