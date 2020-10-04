package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34f7234e
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18070
 */
public class MahnaviVahedi extends EntityType
{
    public MahnaviVahedi()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18046, Light/Patrol Craft
        setSubCategory((byte)9); // uid 18068, Stewart Type (inshore patrol craft)
        setSpecific((byte)2); // uid 18070, Mahnavi-Vahedi
    }
}
