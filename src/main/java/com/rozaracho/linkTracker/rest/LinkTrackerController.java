package com.rozaracho.linkTracker.rest;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.service.LinkTrackerService;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/linkTracker")
public class LinkTrackerController {
    @Autowired
    LinkTrackerService linkTrackerService;

    @PostMapping("/create")
    public ResponseEntity<MaskedLinkDto> save(@RequestParam String url) {
        return new ResponseEntity<>(linkTrackerService.save(url), HttpStatus.CREATED);
    }
}
