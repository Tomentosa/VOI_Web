package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ReasonForInterest;
import model.VehicleMake;
import model.VehicleModel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-04T08:41:55")
@StaticMetamodel(VehicleOfInterest.class)
public class VehicleOfInterest_ { 

    public static volatile SingularAttribute<VehicleOfInterest, ReasonForInterest> reason;
    public static volatile SingularAttribute<VehicleOfInterest, String> licensePlate;
    public static volatile SingularAttribute<VehicleOfInterest, String> color;
    public static volatile SingularAttribute<VehicleOfInterest, String> ownersPhone;
    public static volatile SingularAttribute<VehicleOfInterest, String> vehYear;
    public static volatile SingularAttribute<VehicleOfInterest, VehicleModel> model;
    public static volatile SingularAttribute<VehicleOfInterest, String> ownersName;
    public static volatile SingularAttribute<VehicleOfInterest, VehicleMake> make;

}