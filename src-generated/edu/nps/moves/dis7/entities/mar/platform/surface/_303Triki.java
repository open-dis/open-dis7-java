package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@514eedd8;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27712
 */
public class _303Triki extends EntityType
{
    /** Default constructor */
    public _303Triki()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27697, Light/Patrol Craft
        setSubCategory((byte)3); // uid 27710, PR-72P Class
        setSpecific((byte)2); // uid 27712, 303 Triki
    }
}
