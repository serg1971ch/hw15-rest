package ru.otus.hw15_otusRest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.otus.hw15_otusRest.dtos.ExecuteTransferDtoRq;
import ru.otus.hw15_otusRest.dtos.TransferDto;
import ru.otus.hw15_otusRest.dtos.TransfersPageDto;
import ru.otus.hw15_otusRest.entities.Transfer;
import ru.otus.hw15_otusRest.exceptions_handling.ResourceNotFoundException;
import ru.otus.hw15_otusRest.services.TransfersService;


import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transfers")
public class TransfersController {
    private final TransfersService transfersService = null;

    private static final Function<Transfer, TransferDto> ENTITY_TO_DTO = t -> new TransferDto(t.getId(), t.getAccountSource(), t.getAccountTarget(), t.getMessage(), t.getAmount());

    @GetMapping
    public TransfersPageDto getAllTransfers(@RequestHeader(name = "client-id") String clientId) {
        return new TransfersPageDto(
                transfersService
                        .getAllTransfers(clientId)
                        .stream()
                        .map(ENTITY_TO_DTO).collect(Collectors.toList())
        );
    }

    @GetMapping("/{id}")
    public TransferDto getTransferById(@RequestHeader(required = true, name = "client-id") String clientId, @PathVariable("id") String id) {
        return ENTITY_TO_DTO.apply(transfersService.getTransferById(id, clientId).orElseThrow(() -> new ResourceNotFoundException("Перевод не найден")));
    }

    @PostMapping
    public void executeTransfer(@RequestHeader(name = "client-id") String clientId, @RequestBody ExecuteTransferDtoRq executeTransferDtoRq) {
        transfersService.execute(clientId, executeTransferDtoRq);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> printGreeting() {
        return ResponseEntity.ok("Hello World!");
    }
}
