package edu.nps.moves.dis7.entities.swe.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37d0d373;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 25592
 */
public class AT4HP extends EntityType
{
    /** Default constructor */
    public AT4HP()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21647, Ballistic
        setSubCategory((byte)3); // uid 25589, AT4
        setSpecific((byte)3); // uid 25592, AT4 HP
    }
}
