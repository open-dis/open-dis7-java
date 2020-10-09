package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5965844d
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 13060
 */
public class TombStoneRadarSA10C extends EntityType
{
    public TombStoneRadarSA10C()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 13052, SA-10 Grumble SAM System
        setSpecific((byte)3); // uid 13057, Flap Lid Engagement Radar (36N6E)
        setExtra((byte)3); // uid 13060, Tomb Stone Radar (SA-10C)
    }
}
