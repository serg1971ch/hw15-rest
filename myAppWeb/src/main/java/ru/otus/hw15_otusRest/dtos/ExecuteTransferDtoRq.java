package ru.otus.hw15_otusRest.dtos;

import ru.otus.hw15_otusRest.entities.Account;

public record ExecuteTransferDtoRq(
        Account sourceAccount,
        Account targetAccount, String message, int amount) {
}