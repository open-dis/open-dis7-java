package edu.nps.moves.dis7.objectTypes.PointObject.Passageway.AVLB;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class AVLB extends ObjectType
{
    /** Default constructor */
    public AVLB()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(4)); // Passageway
        setCategory((byte)2); // AVLB
    }
}
