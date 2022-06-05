package com.finanzas.trabajofinal.serviceimplements;

import com.finanzas.trabajofinal.dto.BonoRequest;
import com.finanzas.trabajofinal.entities.Bono;
import com.finanzas.trabajofinal.exceptions.AccessBadRequestException;
import com.finanzas.trabajofinal.repositories.BonoRepository;
import com.finanzas.trabajofinal.util.PeriodoPago;
import com.finanzas.trabajofinal.util.TipoTasaCupon;
import com.finanzas.trabajofinal.util.TipoVencimiento;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BonoService {
    private BonoRepository bonoRepository;
    public BonoService(BonoRepository bonoRepository){
        this.bonoRepository=bonoRepository;
    }

    @Transactional
    public Bono createBono(BonoRequest bonoRequest){
        Bono bonoNew=initBono(bonoRequest);
        return bonoRepository.save(bonoNew);
    }

    private Bono initBono(BonoRequest bonoRequest){
        Bono bonoObj=new Bono();

        bonoObj.setTasaCupon(bonoRequest.getTasaCupon());
        bonoObj.setTipoTasaCupon(TipoTasaCupon.valueOf(bonoRequest.getTipoTasaCupon()));
        bonoObj.setVencimiento(bonoRequest.getVencimiento());
        bonoObj.setTipoVencimiento(TipoVencimiento.valueOf(bonoRequest.getTipoVencimiento()));
        bonoObj.setValorNominal(bonoRequest.getValorNominal());
        bonoObj.setPeriodoPago(PeriodoPago.valueOf(bonoRequest.getPeriodoPago()));

        return bonoObj;
    }
    public void deleteBono(Long id){
        try{
            bonoRepository.deleteById(bonoRepository.findBonoById(id).getId());
        }catch (Exception e){
            throw new AccessBadRequestException("No existe bono");
        }
    }
}
