package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29a1505c;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19016
 */
public class P31Conejera extends EntityType
{
    /** Default constructor */
    public P31Conejera()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19011, Light/Patrol Craft
        setSubCategory((byte)3); // uid 19015, Conejera Class (Coastal Patrol)
        setSpecific((byte)1); // uid 19016, P31 Conejera
    }
}
