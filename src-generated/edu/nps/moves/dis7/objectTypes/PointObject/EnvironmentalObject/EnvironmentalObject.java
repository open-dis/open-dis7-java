package edu.nps.moves.dis7.objectTypes.PointObject.EnvironmentalObject;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class EnvironmentalObject extends ObjectType
{
    /** Default constructor */
    public EnvironmentalObject()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(8)); // Environmental Object
    }
}
