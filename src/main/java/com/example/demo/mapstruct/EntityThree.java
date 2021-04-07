package com.example.demo.mapstruct;

public class EntityThree {
    private int id;
    private String firstName;
    private String lastName;
    private EntityOne entityOne;
    private EntityTwo entityTwo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EntityOne getEntityOne() {
        return entityOne;
    }

    public void setEntityOne(EntityOne entityOne) {
        this.entityOne = entityOne;
    }

    public EntityTwo getEntityTwo() {
        return entityTwo;
    }

    public void setEntityTwo(EntityTwo entityTwo) {
        this.entityTwo = entityTwo;
    }

}
