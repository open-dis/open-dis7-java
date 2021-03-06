package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.PotHole;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class PotHole extends ObjectType
{
    /** Default constructor */
    public PotHole()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)9); // Pot Hole
    }
}
