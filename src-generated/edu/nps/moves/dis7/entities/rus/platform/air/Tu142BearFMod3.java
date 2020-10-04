package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@109d724c
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 13345
 */
public class Tu142BearFMod3 extends EntityType
{
    public Tu142BearFMod3()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)5); // uid 13337, Tu-95 or Tu-142 Bear
        setSpecific((byte)8); // uid 13345, Tu-142 Bear F Mod 3
    }
}