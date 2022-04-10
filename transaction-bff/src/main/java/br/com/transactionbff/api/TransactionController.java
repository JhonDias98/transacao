package br.com.transactionbff.api;

import br.com.transactionbff.dto.TransactionDtoRequest;
import br.com.transactionbff.dto.TransactionDtoResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDtoResponse> enviarTransacao(@RequestBody final TransactionDtoRequest request) {
        return Mono.empty();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDtoResponse> buscarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDtoResponse> removerTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @PatchMapping(path = "/{id}/confirmar")
    public Mono<TransactionDtoResponse> confirmarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }
}
