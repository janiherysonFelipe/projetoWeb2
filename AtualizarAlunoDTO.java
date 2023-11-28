package br.ufrn.imd.universidade.model;

import java.util.Date;
public record AtualizarAlunoDTO( Curso curso, String nomeAluno,  String cpf, String telefone, Date nascimento) {

}
