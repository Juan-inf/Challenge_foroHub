package com.jpc.API.foroHub.domain.topico;

import com.jpc.API.foroHub.domain.curso.Curso;
import com.jpc.API.foroHub.domain.respuesta.Respuesta;
import com.jpc.API.foroHub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Long cursoId,
        @NotNull
        Long usuarioId

) {
}
