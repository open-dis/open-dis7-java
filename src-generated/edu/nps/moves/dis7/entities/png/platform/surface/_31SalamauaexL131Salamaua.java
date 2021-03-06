package edu.nps.moves.dis7.entities.png.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@60e949e1;
 * Country: Papua New Guinea (PNG);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31146
 */
public class _31SalamauaexL131Salamaua extends EntityType
{
    /** Default constructor */
    public _31SalamauaexL131Salamaua()
    {
        setCountry(Country.PAPUA_NEW_GUINEA_PNG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 31144, Landing Craft
        setSubCategory((byte)1); // uid 31145, Balikpapan Class
        setSpecific((byte)1); // uid 31146, 31 Salamaua (ex L 131 Salamaua)
    }
}
