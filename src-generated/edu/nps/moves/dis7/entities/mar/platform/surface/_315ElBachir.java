package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a6f2363
 * Country: Morocco (MAR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27704
 */
public class _315ElBachir extends EntityType
{
    public _315ElBachir()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27697, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27698, Cormoran Class
        setSpecific((byte)6); // uid 27704, 315 El Bachir
    }
}
