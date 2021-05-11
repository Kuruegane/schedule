package br.edu.usj.ads.pw.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @GetMapping(value = "/cadastro")
    public ModelAndView getCadastro() {
        ModelAndView modelAndView = new ModelAndView("cadastro");

        return modelAndView;
    }

    @PostMapping(value = "/adicionar")
    public ModelAndView postAdicionar(@RequestParam String nome, @RequestParam String tipo,
            @RequestParam String telefone) {
        // criar objeto de tipo contato
        Contato contato = new Contato();

        // preencher objeto contato com os dados
        contato.setNome(nome);
        contato.setTipo(tipo);
        contato.setTelefone(telefone);

        // salvar no banco (usando repository)
        contatoRepository.save(contato);

        // criar template
        // popular o template
        // retornar

        return null;
    }

}