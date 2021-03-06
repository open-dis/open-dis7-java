package edu.nps.moves.dis7.entities.swe.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2de3b052;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21651
 */
public class FFV441BHE extends EntityType
{
    /** Default constructor */
    public FFV441BHE()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21647, Ballistic
        setSubCategory((byte)2); // uid 21650, 84mm Carl Gustav rounds
        setSpecific((byte)1); // uid 21651, FFV 441B HE
    }
}
