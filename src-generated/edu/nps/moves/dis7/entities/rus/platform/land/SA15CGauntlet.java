package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@489543a6;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32130
 */
public class SA15CGauntlet extends EntityType
{
    /** Default constructor */
    public SA15CGauntlet()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)10); // uid 13098, SA-15 Gauntlet SAM System
        setSpecific((byte)2); // uid 13100, SA-15 TELAR
        setExtra((byte)2); // uid 32130, SA-15C Gauntlet
    }
}
