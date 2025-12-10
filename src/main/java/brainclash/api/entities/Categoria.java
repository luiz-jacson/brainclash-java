package brainclash.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "asset_type")
    private String asset_type;

    @Column(name = "color_hex")
    private String color_hex;

    @Column(name = "icon_code_point")
    private Long icon_code_point;

    @Column(name = "image_url")
    private String image_url;

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Long getIcon_code_point() {
        return icon_code_point;
    }

    public void setIcon_code_point(Long icon_code_point) {
        this.icon_code_point = icon_code_point;
    }

    public String getColor_hex() {
        return color_hex;
    }

    public void setColor_hex(String color_hex) {
        this.color_hex = color_hex;
    }

    public String getAsset_type() {
        return asset_type;
    }

    public void setAsset_type(String asset_type) {
        this.asset_type = asset_type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

}
