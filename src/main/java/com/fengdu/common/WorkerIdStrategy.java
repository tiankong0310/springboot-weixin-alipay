package com.fengdu.common;

public interface WorkerIdStrategy {
    void initialize();

    long availableWorkerId();

    void release();
}
