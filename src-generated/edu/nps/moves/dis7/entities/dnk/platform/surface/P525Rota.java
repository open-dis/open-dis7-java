package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@327514f
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 25460
 */
public class P525Rota extends EntityType
{
    public P525Rota()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18790, Light/ Patrol Craft
        setSubCategory((byte)3); // uid 25454, Diana Class
        setSpecific((byte)6); // uid 25460, P525 Rota
    }
}