package ru.otus.hw15_otusRest.dtos;

import ru.otus.hw15_otusRest.entities.Account;

public record TransferDto(String id,
                          Account accountSource,
                          Account accountTarget,
                          String message, int amount) {
}