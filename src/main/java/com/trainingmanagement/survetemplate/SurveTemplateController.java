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
    private final SurveTemplateMapper surveTemplateMapper;

    @Autowired
    public SurveTemplateController(SurveTemplateService surveTemplateService,
                                   SurveTemplateMapper surveTemplateMapper) {
        this.surveTemplateService = surveTemplateService;
        this.surveTemplateMapper = surveTemplateMapper;
    }

    @GetMapping("/getAll")
    public List<SurveTemplateDto> getAll() {
        List<SurveTemplate> surveTemplates =  this.surveTemplateService.getAll(); //pobrałam tamplaty
        List<SurveTemplateDto> surveTemoateDtos = surveTemplateMapper.toDto(surveTemplates);

        return surveTemoateDtos;
    }

}
