package edu.nps.moves.dis7.entities.deu.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c9fdb64;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21267
 */
public class HeatMZ extends EntityType
{
    /** Default constructor */
    public HeatMZ()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21257, Ballistic
        setSubCategory((byte)5); // uid 21262, 120 mm
        setSpecific((byte)5); // uid 21267, Heat (MZ)
    }
}
