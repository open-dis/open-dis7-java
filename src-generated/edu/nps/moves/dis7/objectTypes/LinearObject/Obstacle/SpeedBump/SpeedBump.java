package edu.nps.moves.dis7.objectTypes.LinearObject.Obstacle.SpeedBump;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 227
 */
public class SpeedBump extends ObjectType
{
    /** Default constructor */
    public SpeedBump()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)4); // Speed Bump
    }
}
