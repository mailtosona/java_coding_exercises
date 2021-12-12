package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    public static final int GIGASECOND = 1000000000;
    private LocalDateTime localTime ;

    public Exercise004(LocalDate date) {
        localTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        localTime = dateTime;
    }



    LocalDateTime getDateTime () {
        return localTime.plusSeconds(GIGASECOND);
    }

}



