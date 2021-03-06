package edu.nps.moves.dis7.objectTypes.LinearObject.Obstacle.ChainLinkFence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 227
 */
public class ChainLinkFence extends ObjectType
{
    /** Default constructor */
    public ChainLinkFence()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)9); // Chain Link Fence
    }
}
