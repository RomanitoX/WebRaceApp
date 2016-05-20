package Entity;

import Entity.Rank;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.primefaces.model.ScheduleModel;
import org.primefaces.model.map.LatLng;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-05-16T18:37:16")
@StaticMetamodel(Runner.class)
public class Runner_ { 

    public static volatile SingularAttribute<Runner, String> image;
    public static volatile SingularAttribute<Runner, ScheduleModel> eventModel;
    public static volatile SingularAttribute<Runner, Date> birth;
    public static volatile SingularAttribute<Runner, Boolean> isLost;
    public static volatile SingularAttribute<Runner, String> login;
    public static volatile SingularAttribute<Runner, Boolean> followed;
    public static volatile SingularAttribute<Runner, String> firstName;
    public static volatile SingularAttribute<Runner, String> password;
    public static volatile SingularAttribute<Runner, String> phone;
    public static volatile SingularAttribute<Runner, Rank> rank;
    public static volatile SingularAttribute<Runner, Long> id;
    public static volatile SingularAttribute<Runner, String> LastName;
    public static volatile SingularAttribute<Runner, LatLng> position;
    public static volatile SingularAttribute<Runner, Integer> age;
    public static volatile SingularAttribute<Runner, String> email;

}