package ar.com.ada.sb.api.di.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Date expire;

    public Product(Long id, String name, Date expire) {
        this.id = id;
        this.name = name;
        this.expire = expire;
    }

    public Product(String name, Date expire) {
        this.name = name;
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expire=" + expire +
                '}';
    }

    public Boolean isNull() {
        return this.name == null &&
                this.expire == null;
    }
}
