package edu.nps.moves.dis7.objectTypes.LinearObject.Obstacle.ConcreteBarrier;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 227
 */
public class ConcreteBarrier extends ObjectType
{
    /** Default constructor */
    public ConcreteBarrier()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)3); // Concrete Barrier
    }
}
