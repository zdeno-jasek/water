package sk.zdeno.water.application.controller;

public interface Mapper <Domain, Dto> {

    Dto toDto(Domain domain);

    Domain fromDto(Dto dto);
}
