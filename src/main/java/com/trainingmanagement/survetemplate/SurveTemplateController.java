package com.trainingmanagement.survetemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        List<SurveTemplateDto> surveTemplateDtos = surveTemplateMapper.toDto(surveTemplates);

        return surveTemplateDtos;
    }

    @PostMapping("/create")
    public void createSurveTemplate(@RequestBody SurveTemplateDto surveTemplateDto) {
        SurveTemplate surveTemplate = surveTemplateMapper.fromDto(surveTemplateDto);

        System.out.println(surveTemplateDto);
    }

}
