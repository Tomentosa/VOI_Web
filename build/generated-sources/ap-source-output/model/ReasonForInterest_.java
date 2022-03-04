package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-03-04T13:41:56")
@StaticMetamodel(ReasonForInterest.class)
public class ReasonForInterest_ { 

    public static volatile SingularAttribute<ReasonForInterest, String> reason;
    public static volatile CollectionAttribute<ReasonForInterest, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile SingularAttribute<ReasonForInterest, String> description;

}