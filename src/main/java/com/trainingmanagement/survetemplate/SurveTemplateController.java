package com.trainingmanagement.survetemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/template" )
public class SurveTemplateController {

    private final SurveTemplateService surveTemplateService;

    @Autowired
    public SurveTemplateController(SurveTemplateService surveTemplateService) {
        this.surveTemplateService = surveTemplateService;
    }

    @GetMapping("/getAll")
    public List<SurveTemplate> getAll() {
        List<SurveTemplate> temp =  this.surveTemplateService.getAll();
        return temp;
    }

}
