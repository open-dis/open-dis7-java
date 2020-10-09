package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5b7308aa
 * Country: Sweden (SWE)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 21641
 */
public class Ballistic extends EntityType
{
    public Ballistic()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21641, Ballistic
    }
}
