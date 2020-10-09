package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7282af25
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 31898
 */
public class PG7VLHEAT extends EntityType
{
    public PG7VLHEAT()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20445, Ballistic
        setSubCategory((byte)27); // uid 31897, 93 mm
        setSpecific((byte)1); // uid 31898, PG-7VL HEAT
    }
}
