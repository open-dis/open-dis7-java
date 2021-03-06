package edu.nps.moves.dis7.objectTypes.PointObject.EnvironmentalObject.Flood;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class FloodLarge extends ObjectType
{
    /** Default constructor */
    public FloodLarge()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(8)); // Environmental Object
        setCategory((byte)1); // Flood
        setSubCategory((byte)3); // Flood, Large
    }
}
