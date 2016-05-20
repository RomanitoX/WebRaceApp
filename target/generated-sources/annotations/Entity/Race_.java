package Entity;

import Entity.Rank;
import Entity.Runner;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Polyline;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-05-16T18:37:16")
@StaticMetamodel(Race.class)
public class Race_ { 

    public static volatile SingularAttribute<Race, Integer> zoomLevel;
    public static volatile SingularAttribute<Race, MapModel> mapModel;
    public static volatile SingularAttribute<Race, String> middle;
    public static volatile SingularAttribute<Race, String> distance;
    public static volatile SingularAttribute<Race, String> color;
    public static volatile SingularAttribute<Race, Integer> weight;
    public static volatile SingularAttribute<Race, Date> fin;
    public static volatile SingularAttribute<Race, Date> debut;
    public static volatile SetAttribute<Race, Rank> ranks;
    public static volatile SingularAttribute<Race, Polyline> polylineModel;
    public static volatile SingularAttribute<Race, String> name;
    public static volatile ListAttribute<Race, Runner> entrants;
    public static volatile SingularAttribute<Race, Long> id;
    public static volatile SingularAttribute<Race, Float> opacity;
    public static volatile SingularAttribute<Race, LatLng> middlePoint;
    public static volatile SingularAttribute<Race, List> pathOfRace;

}