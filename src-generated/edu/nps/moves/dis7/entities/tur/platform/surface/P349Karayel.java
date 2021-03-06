package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f94fb9d;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23247
 */
public class P349Karayel extends EntityType
{
    /** Default constructor */
    public P349Karayel()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19062, Light/Patrol Craft
        setSubCategory((byte)5); // uid 23245, Yildiz class
        setSpecific((byte)2); // uid 23247, P349 Karayel
    }
}
