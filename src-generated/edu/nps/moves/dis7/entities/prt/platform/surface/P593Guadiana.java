package edu.nps.moves.dis7.entities.prt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ca66933;
 * Country: Portugal (PRT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30464
 */
public class P593Guadiana extends EntityType
{
    /** Default constructor */
    public P593Guadiana()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 30459, Light/Patrol Craft
        setSubCategory((byte)1); // uid 30460, Tejo Class
        setSpecific((byte)4); // uid 30464, P593 Guadiana
    }
}
