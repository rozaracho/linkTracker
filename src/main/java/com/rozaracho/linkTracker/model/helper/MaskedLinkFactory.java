package com.rozaracho.linkTracker.model.helper;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import org.springframework.stereotype.Component;

@Component
public class MaskedLinkFactory {

    private static final String LINK = "http://localhost:8080/l/aBsJu";


    public MaskedLink getMaskedLink(String url) {
        MaskedLink link = new MaskedLink();
        link.setTarget(url);
        link.setLink(LINK);
        link.setValid(true);
        return  link;
    }

    public MaskedLinkDto getMaskedLinkDto(MaskedLink maskedLink) {
        MaskedLinkDto linkDto = new MaskedLinkDto();
        linkDto.setTarget(maskedLink.getTarget());
        linkDto.setLink(maskedLink.getLink());
        linkDto.setValid(maskedLink.getValid());
        return  linkDto;
    }


}
