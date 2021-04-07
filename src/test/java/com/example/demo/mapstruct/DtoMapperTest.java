package com.example.demo.mapstruct;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DtoMapperTest {

    @Test
    void name() {
        EntityOne one = new EntityOne();
        one.setId(1);
        EntityTwo two = new EntityTwo();
        two.setId(2);

        Dto dto = new Dto();
        dto.setEntityThreeId(3);
        dto.setFirstName("FN");
        dto.setLastName("LN");

        EntityThree entityThree = DtoMapper.INSTANCE.toEntity(dto, one, two);

        assertThat(entityThree.getId()).isEqualTo(3);
        assertThat(entityThree.getFirstName()).isEqualTo("FN");
        assertThat(entityThree.getLastName()).isEqualTo("LN");
        assertThat(entityThree.getEntityOne()).isEqualTo(one);
        assertThat(entityThree.getEntityTwo()).isEqualTo(two);
    }

}