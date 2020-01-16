package com.ft.membership.logging;

import org.slf4j.event.Level;

public class FailState implements OperationState {
  private static final FailState INSTANCE = new FailState();

  private FailState() {}

  public static OperationState from(final OperationContext context) {
    context.with(Key.OperationState, "fail");
    context.log(Outcome.Failure, Level.ERROR);

    return INSTANCE;
  }

  @Override
  public String toString() {
    return "failState";
  }
}