package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.RockDrop;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class RockDropCovered extends ObjectType
{
    /** Default constructor */
    public RockDropCovered()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)5); // Rock Drop
        setSubCategory((byte)1); // Rock Drop, Covered
    }
}
