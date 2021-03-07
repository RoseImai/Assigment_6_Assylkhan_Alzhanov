package builder;

public class HouseBuilder implements Builder{
    boolean garage = false;
    boolean pool = false;
    boolean statues = false;
    boolean garden = false;

    @Override
    public void buildGarage() {
        this.garage = true;
    }

    @Override
    public void buildPool() {
        this.pool = true;
    }

    @Override
    public void buildStatues() {
        this.statues = true;
    }

    @Override
    public void buildGarden() {
        this.garden = true;
    }

    public FinalHouse WhatToBuild()
    {
        return new FinalHouse(this.garage, this.pool, this.statues, this.garden);
    }
}
