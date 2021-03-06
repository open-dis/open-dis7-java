package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.Pump;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class PumpGas extends ObjectType
{
    /** Default constructor */
    public PumpGas()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)12); // Pump
        setSubCategory((byte)1); // Pump, Gas
    }
}
