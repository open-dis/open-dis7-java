package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.TreeEvergreen;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class TreeEvergreenLarge extends ObjectType
{
    /** Default constructor */
    public TreeEvergreenLarge()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)11); // Tree, Evergreen
        setSubCategory((byte)3); // Tree, Evergreen, Large
    }
}
