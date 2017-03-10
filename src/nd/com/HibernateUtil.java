package nd.com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



/**
 * Created by ND on 3/7/2017.
 */
public class HibernateUtil {
    public static SessionFactory factory;

    public static void main(String[] args) {

        init();

        Video video = new Video();
        video.setId(123L);
        video.setDescription("the Movie");


        Actor actor = new Actor();
        actor.setName("John Wayne");
        Cast cast = new Cast();
        cast.setVideo(video);
        cast.setActor(actor);



        Session session = factory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(video);
        //session.saveOrUpdate(actor);
        //session.saveOrUpdate(cast);
        session.getTransaction().commit();
        session.close();



        //Session session = factory.openSession();
        //Actor actor = (Actor)session.get(Actor.class,new Long(1));
        //session.close();
        //System.out.println(actor.getName());



    }

    private static void init() {


        /*
        AnnotationConfiguration aconf = new AnnotationConfiguration()
                .addAnnotatedClass(Video.class)
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Cast.class);
        Configuration conf = aconf.configure();
        factory = conf.buildSessionFactory();
        */




        factory = new Configuration().configure().buildSessionFactory();
        //Session session = factory.openSession();
        //session.beginTransaction();
        //session.getTransaction().commit();
        //session.close();

    }



}
