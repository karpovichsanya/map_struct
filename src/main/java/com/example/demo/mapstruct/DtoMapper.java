package com.example.demo.mapstruct;

import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DtoMapper {

    DtoMapper INSTANCE = Mappers.getMapper( DtoMapper.class );

    @Mapping(source = "entityThreeId", target = "id")
    EntityThree toEntity(Dto dto, @Context EntityOne entityOne, @Context EntityTwo entityTwo);

    @AfterMapping
    default void setDependentInfo(
            @MappingTarget EntityThree entityThree,
            @Context EntityOne entityOne,
            @Context EntityTwo entityTwo) {
        entityThree.setEntityOne(entityOne);
        entityThree.setEntityTwo(entityTwo);
    }
}
