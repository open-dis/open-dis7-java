package edu.nps.moves.dis7.entities.prt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f7c0be3;
 * Country: Portugal (PRT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30463
 */
public class P592Mondego extends EntityType
{
    /** Default constructor */
    public P592Mondego()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 30459, Light/Patrol Craft
        setSubCategory((byte)1); // uid 30460, Tejo Class
        setSpecific((byte)3); // uid 30463, P592 Mondego
    }
}
