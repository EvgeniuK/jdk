package com.TMS.Less4;

    public enum Sis {
        DECEMBER("WINTER"),
        JANUARY("WINTER"),
        FEBRUARY( "WINTER"),
        MARCH( "SPRING"),
        APRIL( "SPRING"),
        JUNE("SUMMER"),
        NOVEMBER("AUTUMN");

        Month( Season season) {
            this.days = days;
            this.season = season;
    }


    }