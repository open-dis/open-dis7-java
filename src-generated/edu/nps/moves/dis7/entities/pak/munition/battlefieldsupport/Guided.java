package edu.nps.moves.dis7.entities.pak.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@36510e73;
 * Country: Pakistan (PAK);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 29047
 */
public class Guided extends EntityType
{
    /** Default constructor */
    public Guided()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 29047, Guided
    }
}
