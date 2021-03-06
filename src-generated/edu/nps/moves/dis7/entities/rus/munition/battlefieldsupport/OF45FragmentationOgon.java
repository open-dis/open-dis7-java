package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ebd6fd6;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 28805
 */
public class OF45FragmentationOgon extends EntityType
{
    /** Default constructor */
    public OF45FragmentationOgon()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)54); // uid 28804, 140-mm
        setSpecific((byte)1); // uid 28805, OF-45 Fragmentation (Ogon)
    }
}
