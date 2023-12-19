package com.palacios.infraccionservice.converter;

import org.springframework.stereotype.Component;

import com.palacios.infraccionservice.dto.InfraccionDTO;
import com.palacios.infraccionservice.entity.Infraccion;

@Component
public class InfraccionConverter extends AbstractConverter<Infraccion, InfraccionDTO> {

    @Override
    public InfraccionDTO fromEntity(Infraccion entity) {
        if (entity == null)
            return null;
        return InfraccionDTO.builder()
                .id(entity.getId())
                .fecha(entity.getFecha())
                .falta(entity.getFalta())
                .infraccion(entity.getInfraccion())
                .descripcion(entity.getDescripcion())
                .build();
    }

    @Override
    public Infraccion fromDTO(InfraccionDTO dto) {
        if (dto == null)
            return null;

        return Infraccion.builder()
                .id(dto.getId())
                .fecha(dto.getFecha())
                .falta(dto.getFalta())
                .infraccion(dto.getInfraccion())
                .descripcion(dto.getDescripcion())
                .build();
    }

}
