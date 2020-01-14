
package com.fila.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import static br.com.caelum.vraptor.view.Results.json;
import java.util.List;
import br.com.caelum.vraptor.Result;
import com.fila.entity.Fila;
import com.fila.repository.FilaRepository;
import javax.inject.Inject;

/**
 *
 * @author Luidi Matheus
 */

@Controller
public class FilaController {
    @Inject protected Result result;
    @Inject private FilaRepository filaRepository;
    
    @Path("/")
    public void getFila(){
        List<Fila> filas = filaRepository.todos();
        result.use(json()).withoutRoot().from(filas).include("viagens").serialize();
    }
}
