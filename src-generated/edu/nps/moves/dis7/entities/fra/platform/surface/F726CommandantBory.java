package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25be7b63;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16165
 */
public class F726CommandantBory extends EntityType
{
    /** Default constructor */
    public F726CommandantBory()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)2); // uid 16164, Commandant Riviere class (Avisos Escorteurs)
        setSpecific((byte)1); // uid 16165, F 726 Commandant Bory
    }
}
