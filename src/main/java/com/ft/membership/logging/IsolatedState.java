package com.ft.membership.logging;

public class IsolatedState implements OperationState {
  private static IsolatedState INSTANCE = new IsolatedState();

  private IsolatedState() {}

  public static IsolatedState from(SimpleOperationContext context) {
    return INSTANCE;
  }

  @Override
  public String toString() {
    return "isolatedState";
  }
}