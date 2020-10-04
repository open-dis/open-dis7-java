package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b441e56
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 20406
 */
public class M1940HEITUOZR132 extends EntityType
{
    public M1940HEITUOZR132()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 20393, Ballistic
        setSubCategory((byte)5); // uid 20405, 25 mm
        setSpecific((byte)1); // uid 20406, M1940 HE-I-T UOZR-132
    }
}
