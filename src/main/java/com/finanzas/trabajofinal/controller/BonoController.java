package com.finanzas.trabajofinal.controller;

import com.finanzas.trabajofinal.dto.BonoRequest;
import com.finanzas.trabajofinal.dto.BonoResponse;
import com.finanzas.trabajofinal.entities.Bono;
import com.finanzas.trabajofinal.serviceimplements.BonoService;
import com.finanzas.trabajofinal.util.EntityDtoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;

@RestController
@RequestMapping("/bono")
public class BonoController {
    private BonoService bonoService;
    private EntityDtoConverter converter;

    public BonoController(BonoService bonoService,EntityDtoConverter converter){
        this.bonoService=bonoService;
        this.converter=converter;
    }

    @PostMapping
    public ResponseEntity<BonoResponse> createBono(@Valid @RequestBody BonoRequest bonoRequest){
        Bono bono= bonoService.createBono(bonoRequest);
        return new ResponseEntity<>(converter.convertBonoToDto(bono), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BonoResponse> deleteBono(@PathVariable Long id){
        bonoService.deleteBono(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
