package edu.nps.moves.dis7.entities.nzl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4fdfa676;
 * Country: New Zealand (NZL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30215
 */
public class P148Otago extends EntityType
{
    /** Default constructor */
    public P148Otago()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 30213, Light/Patrol Craft
        setSubCategory((byte)1); // uid 30214, Protector/Otago Class (Offshore Patrol Vessels)
        setSpecific((byte)1); // uid 30215, P148 Otago
    }
}
