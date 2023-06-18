package sk.zdeno.water.application.controller;

public interface Build<Builder, Dto> {

        Builder fromDto(Dto dto);

}
