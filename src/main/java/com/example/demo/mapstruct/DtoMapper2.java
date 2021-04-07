package com.example.demo.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DtoMapper2 {

    DtoMapper2 INSTANCE = Mappers.getMapper( DtoMapper2.class );

    @Mapping(source = "dto.entityThreeId", target = "id")
    @Mapping(source = "entityOne", target = "entityOne")
    @Mapping(source = "entityTwo", target = "entityTwo")
    EntityThree toEntity(Dto dto, EntityOne entityOne, EntityTwo entityTwo);
}
