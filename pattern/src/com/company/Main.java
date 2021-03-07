package com.company;
import builder.Builder;
import builder.Director;
import builder.HouseBuilder;
import factoring.Application;
import factoring.Dialog;
import singleton.Singleton;
import builder.House;
import builder.FinalHouse;

import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Singleton singl = Singleton.getInstance();
        singl.query("Select * from student");
        HouseBuilder builder = new HouseBuilder();
        Director director = new Director();
        director.TypeOfHouse(House.WITH_GARAGE, builder);
        FinalHouse house = builder.WhatToBuild();
    }
}
