package edu.nps.moves.dis7.objecttypes.PointObject.Obstacle.Abatis.Other;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Other extends ObjectType
{
    public Other()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)1); // Abatis
        setSubCategory((byte)0); // Other
    }
}
