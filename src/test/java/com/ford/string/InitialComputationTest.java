package com.ford.string;

import org.junit.Test;

public class InitialComputationTest {
    @Test
    public void shouldDisplayInitial(){
        InitialComputation initial = new InitialComputation();
        initial.getInitialFromFullName();
    }
}
