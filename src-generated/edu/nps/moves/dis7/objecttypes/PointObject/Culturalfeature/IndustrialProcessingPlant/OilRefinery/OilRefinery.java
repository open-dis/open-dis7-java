package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.IndustrialProcessingPlant.OilRefinery;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class OilRefinery extends ObjectType
{
    public OilRefinery()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)13); // Industrial Processing Plant
        setSubCategory((byte)1); // Oil Refinery 
    }
}
