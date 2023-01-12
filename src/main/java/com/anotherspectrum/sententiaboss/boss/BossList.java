package com.anotherspectrum.sententiaboss.boss;

import lombok.Getter;

public enum BossList {

    Boss1("불의 결정","타오르는 신전", 0, -402.949, 69.000, -344.444),
    Boss2("물의 결정","심해", 0, -389.367, 62.67, -313.442),
    Boss3("흙의 결정","낮은 땅", 0, -412.0, 68.0, -333.0),
    Boss4("바람의 결정","고요한 하늘", 0, -416.0, 136.0, -309.0),
    SUBBoss1("불의 원소","불꽃이 꺼지지 않는 곳", 0, -396.299, 69.0, -344.794),
    SUBBoss2("물의 원소","낮은 물", 0, -397., 66.00, -326.581),
    SUBBoss3("흙의 원소","고요한 대지", 0, -416.0, 71.0, -343.0),
    SUBBoss4("바람의 원소","하늘이 닿는 곳",0, -413.0, 80.0, -321.0);

    @Getter
    private String name;

    @Getter
    private String bossMapName;
    @Getter
    private int level;
    @Getter
    private double xCoordinate;
    @Getter
    private double yCoordinate;
    @Getter
    private double zCoordinate;

    BossList(String name, String bossMapName, int level, double xCoordinate, double yCoordinate, double zCoordinate) {

        this.name = name;
        this.bossMapName = bossMapName;
        this.level = level;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;


    }


}
