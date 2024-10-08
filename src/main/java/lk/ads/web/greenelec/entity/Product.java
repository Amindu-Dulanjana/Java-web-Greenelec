package lk.ads.web.greenelec.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal price;
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    private boolean active;
    @Column(name = "image")
    @CollectionTable(name = "product_image" , joinColumns = @JoinColumn(name = "product_id"))
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> images;

    public Product(){}

    public Product(Long id, String title, BigDecimal price, String description, boolean active, List<String> images) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.active = active;
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
