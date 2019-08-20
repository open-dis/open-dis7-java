package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.Tent.Tent_Kuchi;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Tent_Kuchi extends ObjectType
{
    public Tent_Kuchi()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)5); // Tent
        setSubCategory((byte)11); // Tent, Kuchi
    }
}
