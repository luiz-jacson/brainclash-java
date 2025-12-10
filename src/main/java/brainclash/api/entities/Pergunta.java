package brainclash.api.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "perguntas")
public class Pergunta {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Column(name="id_categoria")
    private UUID id_categoria;

    @Column(name = "questao")
    private String questao;

    @Column(name = "resposta_correta")
    private String resposta_correta;

    @Column(name="respostas")
    private List<String> respostas;

    public UUID getId() {
        return id;
    }


    public UUID getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(UUID id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getResposta_correta() {
        return resposta_correta;
    }

    public void setResposta_correta(String resposta_correta) {
        this.resposta_correta = resposta_correta;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
}
