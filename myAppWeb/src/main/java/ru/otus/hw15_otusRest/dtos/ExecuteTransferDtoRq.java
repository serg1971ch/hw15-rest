package ru.otus.hw15_otusRest.dtos;

public record ExecuteTransferDtoRq(
        String targetClientId, String sourceAccount,
        String targetAccount, String message, int amount) {
}