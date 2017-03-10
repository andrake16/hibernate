package nd.com;

import javax.persistence.*;

/**
 * Created by ND on 3/7/2017.
 */
@Entity
@Table(name = "Cast")
public class Cast {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "video")
    private Video video;

    @ManyToOne
    @JoinColumn(name = "actor")
    private Actor actor;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
