package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.ContainerBasedBuilding;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class ContainerBasedBuildingHouseSingle extends ObjectType
{
    /** Default constructor */
    public ContainerBasedBuildingHouseSingle()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)8); // Container-Based Building
        setSubCategory((byte)2); // Container-Based Building, House, Single
    }
}
