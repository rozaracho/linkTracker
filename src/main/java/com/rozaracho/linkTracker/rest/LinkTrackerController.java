package com.rozaracho.linkTracker.rest;

import com.rozaracho.linkTracker.model.entity.MaskedLink;
import com.rozaracho.linkTracker.model.service.LinkTrackerService;
import com.rozaracho.linkTracker.rest.dto.MaskedLinkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/linkTracker")
public class LinkTrackerController {
    @Autowired
    LinkTrackerService linkTrackerService;

    @PostMapping("/create")
    public ResponseEntity<MaskedLinkDto> save(@RequestParam String url) {
        return new ResponseEntity<>(linkTrackerService.save(url), HttpStatus.CREATED);
    }

    @PostMapping("/redirect")
    public ResponseEntity redirect(@RequestParam String url) {
        if (linkTrackerService.redirect(url)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
