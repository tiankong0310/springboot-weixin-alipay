package com.fengdu.common;

import com.fengdu.common.strategy.DayPrefixRandomCodeStrategy;

public class DayCode {
    static RandomCodeStrategy strategy;

    static {
        DayPrefixRandomCodeStrategy dayPrefixCodeStrategy = new DayPrefixRandomCodeStrategy("yyMM");
        dayPrefixCodeStrategy.setMinRandomSize(7);
        dayPrefixCodeStrategy.setMaxRandomSize(7);
        strategy = dayPrefixCodeStrategy;
        strategy.init();
    }

    public static synchronized String next() {
        return String.format("%d-%04d-%07d", Id.getWorkerId(), strategy.prefix(), strategy.next());
    }
}
