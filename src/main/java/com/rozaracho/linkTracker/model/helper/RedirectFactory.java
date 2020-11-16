package com.rozaracho.linkTracker.model.helper;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.entity.Redirect;
import org.springframework.stereotype.Component;

@Component
public class RedirectFactory {

    public Redirect getRedirect(MaskedLink maskedLink) {
        Redirect redirect = new Redirect();
        redirect.setMaskedLink(maskedLink);
        return  redirect;
    }
}
