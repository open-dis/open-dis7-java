package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.MOUTBuilding;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class MOUTBuildingStore extends ObjectType
{
    /** Default constructor */
    public MOUTBuildingStore()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)7); // MOUT Building
        setSubCategory((byte)4); // MOUT Building, Store
    }
}
