package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.DisturbedEarth;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class DisturbedEarth extends ObjectType
{
    /** Default constructor */
    public DisturbedEarth()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)3); // Disturbed Earth
    }
}
