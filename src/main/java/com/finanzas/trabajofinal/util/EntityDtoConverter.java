package com.finanzas.trabajofinal.util;

import com.finanzas.trabajofinal.dto.BonoResponse;
import com.finanzas.trabajofinal.entities.Bono;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoConverter {
    private ModelMapper modelMapper;

    public EntityDtoConverter(ModelMapper modelMapper){this.modelMapper = modelMapper;}

    public BonoResponse convertBonoToDto(Bono bono){
        return modelMapper.map(bono,BonoResponse.class);
    }
}
