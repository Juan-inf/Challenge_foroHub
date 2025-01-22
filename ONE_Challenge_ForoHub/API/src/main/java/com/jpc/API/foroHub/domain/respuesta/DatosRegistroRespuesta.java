package com.jpc.API.foroHub.domain.respuesta;

import com.jpc.API.foroHub.domain.topico.Topico;
import com.jpc.API.foroHub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DatosRegistroRespuesta(
        @NotBlank
        String mensaje,
        @NotNull
        Long topicoId,
        @NotNull
        Long usuarioId
) {
}