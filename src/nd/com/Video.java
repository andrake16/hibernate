package nd.com;

import javax.persistence.*;

/**
 * Created by ND on 3/7/2017.
 */

@Entity
@Table(name = "video")
public class Video {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description" , length = 64)
    private String description;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
