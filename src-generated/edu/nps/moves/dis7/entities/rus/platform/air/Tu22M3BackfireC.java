package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31ee96f4;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 13330
 */
public class Tu22M3BackfireC extends EntityType
{
    /** Default constructor */
    public Tu22M3BackfireC()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)3); // uid 13327, Tu-26 (Tu-22M) Backfire
        setSpecific((byte)3); // uid 13330, Tu-22M-3 Backfire C
    }
}
