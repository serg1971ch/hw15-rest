package ru.otus.hw15_otusRest.dtos;

public record TransferDto(String id,
                          String clientId, String targetClientId,
                          String sourceAccount, String targetAccount,
                          String message, int amount) {
}